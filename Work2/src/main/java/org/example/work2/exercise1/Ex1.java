package org.example.work2.exercise1;

import java.util.Scanner;

public class Ex1 {
    public static boolean isSimple(Integer number) {
        if (number < 2) return false;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Задание1:Дана последовательность N целых чисел. Найти сумму простых чисел.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько простых чисел будет введено: ");
        int length = scanner.nextInt();
        int number;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
            if (isSimple(number)) {
                sum += number;
            }
        }
        scanner.close();
        System.out.println("Сумма простых чисел: " + sum);
    }
}


