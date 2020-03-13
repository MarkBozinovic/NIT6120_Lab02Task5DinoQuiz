package com.example.vapor.nit6120_lab02task5dinoquiz;

public class TrueFalse
{
    /**
     * Created by Sunam on 3/4/2016.
     */

        private int mQuestion;
        private boolean mTrueQuestion;

        public int getQuestion()
        {
            return mQuestion;
        }

        public void setQuestion(int question)
        {
            mQuestion = question;
        }

        public boolean isTrueQuestion()
        {
            return mTrueQuestion;
        }

        public void setTrueQuestion(boolean trueQuestion)
        {
            mTrueQuestion = trueQuestion;
        }

        public TrueFalse(int question, boolean trueQuestion)
        {
            mQuestion = question;
            mTrueQuestion = trueQuestion;
        }
}
