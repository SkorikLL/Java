package org.example.work2.exercise2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Задание2:Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько простых чисел будет введено: ");
        int length = scanner.nextInt();
        int number;
        int previousNumber = 0;
        boolean flag = true;
        for (int i = 0; i < length; i++) {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
            if (i >= 1 && flag) {
                flag = number > previousNumber;
            }
            previousNumber = number;
        }
        if (flag) {
            System.out.println("Последовательность является возрастающей");
        } else {
            System.out.println("Последовательность не является возрастающей");
        }
    }
}
