package com.epam.training.student_katsiaryna_novikava.fundamental.main_task;

import java.util.Scanner;

public class SumAndMult {
    public static void main(String[] args) {
        int sum = 0;
        int mult = 1;
        System.out.println("Сколько чисел вы собираетесь ввести?");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];

        System.out.println("Введите целые числа через пробел" + "и нажмите <Enter> ");
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        for (int i = 0; i < size; i++) {
            sum = sum + nums[i];
        }
        System.out.println("Сумма чисел равна " + sum);
        for (int x : nums) {
            mult = mult * x;
        }
        System.out.println("Произведение чисел равно " + mult);
    }
}
