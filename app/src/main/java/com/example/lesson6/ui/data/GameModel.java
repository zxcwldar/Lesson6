package com.example.lesson6.ui.data;

public class GameModel {
    private String level;
    private String quiz;
    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private String correctAnswer;

    public GameModel(String level, String quiz, String answerOne, String answerTwo, String answerThree, String correctAnswer) {
        this.level = level;
        this.quiz = quiz;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.correctAnswer = correctAnswer;
    }

    public String getLevel() {
        return level;
    }

    public String getQuiz() {
        return quiz;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public String getAnswerThree() {
        return answerThree;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
