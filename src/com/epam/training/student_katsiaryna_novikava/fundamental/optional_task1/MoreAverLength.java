package com.epam.training.student_katsiaryna_novikava.fundamental.optional_task1;

import java.util.Scanner;

public class MoreAverLength {
    public static void main(String[] args) {
        System.out.println("Сколько чисел вы собираетесь ввести?");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];

        System.out.println("Введите целые числа через пробел" + "и нажмите <Enter> ");
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        double average;
        double sum = 0;
        int ex;
        for (int y : nums) {
            ex = (String.valueOf(y)).length();
            sum += ex;
        }
        average = sum / size;
        System.out.println("Средняя длина всех чисел " + average);
        int n = 0;
        for (int x : nums) {
            if ((String.valueOf(x)).length() > average) {
                System.out.println("Число " + x + " с длиной больше средней.Его длина равна " + (String.valueOf(x)).length());
                n++;
            }
        }
        if (n == 0) System.out.println("Все числа одинаковой длины");
    }
}