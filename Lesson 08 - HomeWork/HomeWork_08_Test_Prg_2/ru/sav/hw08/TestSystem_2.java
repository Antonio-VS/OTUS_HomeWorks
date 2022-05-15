package ru.sav.hw08;

import java.util.Scanner;

public class TestSystem_2 {

    // Классы Person - TestLog - Test - Question
    // Класс Questions - список вопросов

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВикторина начинается!");
        System.out.println("Всего 3 вопроса, нужно указать номер правильного варианта ответа.  \n");

        Person person = new Person("Vasiliy");

        int questionNumber = 0;
        int rightAnswer = 0;
        for (Question q : person.testLog.test.question) {
            questionNumber++;
            System.out.println("************************");
            System.out.println("Вопрос " + questionNumber + ". " + q.getQuestion());

            for (int i = 0; i < q.getAnswers().length; i++) {
                System.out.println(i + 1 + ". " + q.getAnswers()[i]);
            }
            System.out.print("Ваш ответ: ");
            String personAnswer = scanner.nextLine();
            if (personAnswer.equalsIgnoreCase(q.getRightAnswer())) {
                rightAnswer++;
                System.out.println("Правильно!\n");
            } else {
                System.out.println("Неправильно.\n");
            }
        }
        System.out.println("Результат: правильных ответов " + rightAnswer + ", неправильных - " + (questionNumber - rightAnswer) + ".");
    }
}