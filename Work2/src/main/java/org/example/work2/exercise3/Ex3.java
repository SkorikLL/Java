package org.example.work2.exercise3;

import java.util.Arrays;

public class Ex3 {
    public static void randomArr(int [] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 50 - 25);
        }
    }

    public static int indexSumTwoValuedElements(int [] mas) {
        int indexSum = 0;
        for (int i = 0; i < mas.length; i++) {
            if ((mas[i] < 100 && mas[i] > 9) || (mas[i] > -100 && mas[i] < -9)) {
                indexSum += i;
            }
        }
        return indexSum;
    }

    public static void printArr(int [] mas, int indexSum) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                System.out.println("Индекс " + indexSum + ": " + mas[i]);
            } else
                System.out.println("Индекс " + i + ": " + mas[i]);
        }
    }

    public static void main(String[] args) {

        System.out.println("Задание3:Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.");
        int[] mas = new int[8];
        randomArr(mas);
        System.out.println(Arrays.toString(mas));
        int indexSum = indexSumTwoValuedElements(mas);
        printArr(mas, indexSum);

    }
}
