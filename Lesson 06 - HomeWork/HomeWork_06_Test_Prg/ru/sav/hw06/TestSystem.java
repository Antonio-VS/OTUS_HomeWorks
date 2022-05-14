package ru.sav.hw06;

import java.util.Scanner;

public class TestSystem {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String answer;
            int totalAnswers = 3;
            int rightAnswers = 0;

            String[][] arrayOfQuestions = new String[totalAnswers][];
            arrayOfQuestions[0] = new String[]{"Вопрос 1. Каким видом искусства занимался Ле Корбюзье?", "Театр", "Архитектура", "Поэзия", "Балет", "2"};
            arrayOfQuestions[1] = new String[]{"Вопрос 2. Каким символом в физике обозначают скорость света?", "S", "W", "P", "C", "4"};
            arrayOfQuestions[2] = new String[]{"Вопрос 3. В прямоугольном треугольнике квадрат длины гипотенузы равен сумме квадратов длин катетов. Кто автор теоремы?", "Гаусс", "Ломоносов", "Пифагор", "Лобачевский", "3"};

            System.out.println("Викторина начинается! \n");
            for (String[] arrayOfQuestion : arrayOfQuestions) {
                for (int j = 0; j < arrayOfQuestion.length - 1; j++) {
                    if (j != 0) {
                        System.out.print(j + ". ");
                    }
                    System.out.println(arrayOfQuestion[j]);
                }
                System.out.print("Ваш ответ: ");
                answer = scanner.nextLine();
                if (answer.equalsIgnoreCase(arrayOfQuestion[arrayOfQuestion.length - 1])) {
                    rightAnswers++;
                    System.out.println("Правильно!\n");
                } else {
                    System.out.println("Неправильно.\n");
                }
            }
            System.out.println("Результат: правильно " + rightAnswers + ", неправильно " + (totalAnswers - rightAnswers) + ".");
        }
}
