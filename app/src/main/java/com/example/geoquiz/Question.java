package com.example.geoquiz;

public class Question {
    boolean answer;
    int questionText;


    public Question(int questionText, boolean answer) {
        this.answer = answer;
        this.questionText = questionText;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public int getQuestionText() {
        return questionText;
    }

    public void setQuestionText(int questionText) {
        this.questionText = questionText;
    }
}
