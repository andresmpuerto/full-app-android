package com.andrempuerto.baseappandroid.databinding;
import com.andrempuerto.baseappandroid.R;
import com.andrempuerto.baseappandroid.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.text_title_score, 9);
        sViewsWithIds.put(R.id.text_title_game, 10);
        sViewsWithIds.put(R.id.text_title, 11);
        sViewsWithIds.put(R.id.img_ball, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            );
        this.btnNeutral.setTag("2");
        this.btnNext.setTag(null);
        this.btnNo.setTag("1");
        this.btnTryAgain.setTag(null);
        this.btnYes.setTag("0");
        this.lyBall.setTag(null);
        this.lyButtons.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textScore.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.endGame == variableId) {
            setEndGame((java.lang.Boolean) variable);
        }
        else if (BR.showBall == variableId) {
            setShowBall((java.lang.Boolean) variable);
        }
        else if (BR.totalScore == variableId) {
            setTotalScore((java.lang.Integer) variable);
        }
        else if (BR.onClickListener == variableId) {
            setOnClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.showNext == variableId) {
            setShowNext((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEndGame(@Nullable java.lang.Boolean EndGame) {
        this.mEndGame = EndGame;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.endGame);
        super.requestRebind();
    }
    public void setShowBall(@Nullable java.lang.Boolean ShowBall) {
        this.mShowBall = ShowBall;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.showBall);
        super.requestRebind();
    }
    public void setTotalScore(@Nullable java.lang.Integer TotalScore) {
        this.mTotalScore = TotalScore;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.totalScore);
        super.requestRebind();
    }
    public void setOnClickListener(@Nullable android.view.View.OnClickListener OnClickListener) {
        this.mOnClickListener = OnClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.onClickListener);
        super.requestRebind();
    }
    public void setShowNext(@Nullable java.lang.Boolean ShowNext) {
        this.mShowNext = ShowNext;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.showNext);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean totalScoreToStringJavaLangObjectNull = false;
        java.lang.String totalScoreToStringJavaLangObjectNullJavaLangString0TotalScoreToString = null;
        int androidxDatabindingViewDataBindingSafeUnboxShowNextViewVISIBLEViewINVISIBLE = 0;
        java.lang.Boolean endGame = mEndGame;
        java.lang.Boolean showBall = mShowBall;
        int androidxDatabindingViewDataBindingSafeUnboxEndGameViewVISIBLEViewINVISIBLE = 0;
        int androidxDatabindingViewDataBindingSafeUnboxEndGameViewGONEViewVISIBLE = 0;
        java.lang.Integer totalScore = mTotalScore;
        android.view.View.OnClickListener onClickListener = mOnClickListener;
        int androidxDatabindingViewDataBindingSafeUnboxShowBallViewVISIBLEViewGONE = 0;
        java.lang.Boolean showNext = mShowNext;
        boolean ShowNext1 = false;
        java.lang.String totalScoreToString = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxShowBall = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxShowNext = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxEndGame = false;
        boolean AndroidxDatabindingViewDataBindingSafeUnboxShowNext1 = false;

        if ((dirtyFlags & 0x21L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(endGame)
                androidxDatabindingViewDataBindingSafeUnboxEndGame = androidx.databinding.ViewDataBinding.safeUnbox(endGame);
            if((dirtyFlags & 0x21L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxEndGame) {
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x1000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(endGame) ? View.VISIBLE : View.INVISIBLE
                androidxDatabindingViewDataBindingSafeUnboxEndGameViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxEndGame) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(endGame) ? View.GONE : View.VISIBLE
                androidxDatabindingViewDataBindingSafeUnboxEndGameViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxEndGame) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x22L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(showBall)
                androidxDatabindingViewDataBindingSafeUnboxShowBall = androidx.databinding.ViewDataBinding.safeUnbox(showBall);
            if((dirtyFlags & 0x22L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxShowBall) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(showBall) ? View.VISIBLE : View.GONE
                androidxDatabindingViewDataBindingSafeUnboxShowBallViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxShowBall) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x24L) != 0) {



                if (totalScore != null) {
                    // read totalScore.toString()
                    totalScoreToString = totalScore.toString();
                }


                // read totalScore.toString() == null
                totalScoreToStringJavaLangObjectNull = (totalScoreToString) == (null);
            if((dirtyFlags & 0x24L) != 0) {
                if(totalScoreToStringJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
        }
        if ((dirtyFlags & 0x28L) != 0) {
        }
        if ((dirtyFlags & 0x30L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(showNext)
                AndroidxDatabindingViewDataBindingSafeUnboxShowNext1 = androidx.databinding.ViewDataBinding.safeUnbox(showNext);
            if((dirtyFlags & 0x30L) != 0) {
                if(AndroidxDatabindingViewDataBindingSafeUnboxShowNext1) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(showNext) ? View.VISIBLE : View.INVISIBLE
                androidxDatabindingViewDataBindingSafeUnboxShowNextViewVISIBLEViewINVISIBLE = ((AndroidxDatabindingViewDataBindingSafeUnboxShowNext1) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                // read !androidx.databinding.ViewDataBinding.safeUnbox(showNext)
                ShowNext1 = !AndroidxDatabindingViewDataBindingSafeUnboxShowNext1;


                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(showNext))
                androidxDatabindingViewDataBindingSafeUnboxShowNext = androidx.databinding.ViewDataBinding.safeUnbox(ShowNext1);
        }
        // batch finished

        if ((dirtyFlags & 0x24L) != 0) {

                // read totalScore.toString() == null ? "0" : totalScore.toString()
                totalScoreToStringJavaLangObjectNullJavaLangString0TotalScoreToString = ((totalScoreToStringJavaLangObjectNull) ? ("0") : (totalScoreToString));
        }
        // batch finished
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            this.btnNeutral.setOnClickListener(onClickListener);
            this.btnNext.setOnClickListener(onClickListener);
            this.btnNo.setOnClickListener(onClickListener);
            this.btnTryAgain.setOnClickListener(onClickListener);
            this.btnYes.setOnClickListener(onClickListener);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.btnNext.setVisibility(androidxDatabindingViewDataBindingSafeUnboxShowNextViewVISIBLEViewINVISIBLE);
            this.lyButtons.setEnabled(androidxDatabindingViewDataBindingSafeUnboxShowNext);
        }
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            this.btnTryAgain.setVisibility(androidxDatabindingViewDataBindingSafeUnboxEndGameViewVISIBLEViewINVISIBLE);
            this.lyButtons.setVisibility(androidxDatabindingViewDataBindingSafeUnboxEndGameViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            this.lyBall.setVisibility(androidxDatabindingViewDataBindingSafeUnboxShowBallViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textScore, totalScoreToStringJavaLangObjectNullJavaLangString0TotalScoreToString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): endGame
        flag 1 (0x2L): showBall
        flag 2 (0x3L): totalScore
        flag 3 (0x4L): onClickListener
        flag 4 (0x5L): showNext
        flag 5 (0x6L): null
        flag 6 (0x7L): totalScore.toString() == null ? "0" : totalScore.toString()
        flag 7 (0x8L): totalScore.toString() == null ? "0" : totalScore.toString()
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(showNext) ? View.VISIBLE : View.INVISIBLE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(showNext) ? View.VISIBLE : View.INVISIBLE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(endGame) ? View.VISIBLE : View.INVISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(endGame) ? View.VISIBLE : View.INVISIBLE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(endGame) ? View.GONE : View.VISIBLE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(endGame) ? View.GONE : View.VISIBLE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(showBall) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(showBall) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}