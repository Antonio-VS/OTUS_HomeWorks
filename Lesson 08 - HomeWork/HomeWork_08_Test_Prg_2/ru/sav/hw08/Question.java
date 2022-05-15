package ru.sav.hw08;

class Question {
    private String question;
    private String[] answers;
    private String rightAnswer;

    Question(String question, String[] answers, String rightAnswer){
        this.question= question;
        this.answers = answers;
        this.rightAnswer = rightAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }
}
