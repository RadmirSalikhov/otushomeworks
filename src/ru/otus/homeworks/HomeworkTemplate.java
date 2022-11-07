package ru.otus.homeworks;

import java.util.Scanner;

public class HomeworkTemplate {

    public static void main(String[] args) {

              System.out.println("Начнем тестирование №1. Для выхода наберите 0");
        System.out.println("Для ответа впишите соответсвующую цифру: ");
        try (Scanner scanner = new Scanner(System.in)) {

            String questionFirst = "Сколько будет 1+10? \n1. 10 \n2. 11 \n3. 12";
            String questionSecond = "\nКакого цвета небо? \n1. Зеленое \n2. Голубое \n3. Желтое";
            String questionThird = "\nЧто следует за Зимой \n1. Снег \n2. Лето \n3. Весна";

            String[][] matrix = {
                    {questionFirst, "A", "B", "A"},
                    {questionSecond, "A", "B", "A"},
                    {questionThird, "A", "A", "B"}};

            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][0]);
                String answer = scanner.nextLine();

                if (answer.toLowerCase().trim().equals("0")) {
                    System.out.println("До свидания");
                    break;
                }
                else if ((matrix[i][Integer.parseInt(answer)]).equals("B")) {
                    System.out.println("Правильно");

                }
                else if ((matrix[i][Integer.parseInt(answer)]).equals("A")) {
                    System.out.println("Не правильно");

                }
            }
        }
    }
}