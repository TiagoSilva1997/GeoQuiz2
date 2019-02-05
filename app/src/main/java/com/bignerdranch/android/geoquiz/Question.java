package com.bignerdranch.android.geoquiz;

public class Question {

    private int mTextResId;
    private boolean mAwnserTrue;



    public Question(int mTextResId, boolean mAwnserTrue) {
        this.mTextResId = mTextResId;
        this.mAwnserTrue = mAwnserTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAwnserTrue() {
        return mAwnserTrue;
    }

    public void setAwnserTrue(boolean awnserTrue) {
        mAwnserTrue = awnserTrue;
    }
}
