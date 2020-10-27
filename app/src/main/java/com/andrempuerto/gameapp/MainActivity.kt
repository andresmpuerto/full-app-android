package com.andrempuerto.gameapp

import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.andrempuerto.gameapp.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var count = 0
    private var maxQuestion = 10
    private val questions = ArrayList<Question>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        generateRandomGame()
        binding.apply {
            textTitle.text = questions[count].question
            onClickListener = this@MainActivity
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_try_again -> {
                count = 0
                generateRandomGame()
                with(binding) {
                    textTitle.text = questions[count].question
                    totalScore = 0
                    endGame = false
                }
            }
            R.id.btn_no,
            R.id.btn_yes,
            R.id.btn_neutral -> {
                clickHandlerFunction(v)
            }
            R.id.btn_next -> {
                binding.showBall = false
                binding.showNext = false
                if (count < maxQuestion - 1) {
                    binding.textTitle.text = questions[++count].question
                } else {
                    binding.endGame = true
                    binding.textTitle.text = "Your score was: ${binding.textScore.text} / ${maxQuestion * 3}"
                }
            }
        }
    }

    private fun generateRandomGame() {
        questions.clear()
        for (number in 1..maxQuestion) {
            questions.add(
                Question("Turn $number/$maxQuestion", (0..2).shuffled().first())
            )
        }
    }

    private fun clickHandlerFunction(view: View) {
        if (questions[count].anwser == view.tag.toString().toInt()) {
            binding.totalScore = binding.textScore.text.toString().toInt() + 3
        }
        binding.lyBall.gravity = when (questions[count].anwser) {
            0 -> Gravity.START
            1 -> Gravity.CENTER
            else -> Gravity.END
        }
        binding.showBall = true
        binding.showNext = true
    }
}

data class Question(
    var question: String,
    var anwser: Int
)