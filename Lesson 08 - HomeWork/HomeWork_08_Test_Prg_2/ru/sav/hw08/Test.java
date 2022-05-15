package ru.sav.hw08;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import static ru.sav.hw08.Questions.arrayOfQuestions;


class Test {
    private int numberOfQuestions;
    Question[] question;

    Test(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
        question = new Question[this.numberOfQuestions];

        Set<Integer> generated = new HashSet<>();
        while (generated.size() < this.numberOfQuestions) {
            generated.add(ThreadLocalRandom.current().nextInt(0, arrayOfQuestions.length)); //+1
        }

        int k = 0;
        for (int i : generated) {
            String[] answers = new String[arrayOfQuestions[i].length - 2];
            for (int j = 1; j < arrayOfQuestions[i].length - 1; j++) {
                answers[j - 1] = arrayOfQuestions[i][j];
            }
            question[k] = new Question(arrayOfQuestions[i][0], answers, arrayOfQuestions[i][arrayOfQuestions[i].length - 1]);
            k++;
        }
    }
}