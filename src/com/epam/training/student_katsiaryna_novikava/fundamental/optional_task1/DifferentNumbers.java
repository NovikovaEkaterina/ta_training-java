package com.epam.training.student_katsiaryna_novikava.fundamental.optional_task1;

import java.util.Scanner;

public class DifferentNumbers {
    public static void main(String[] args) {
        System.out.println("Сколько чисел вы собираетесь ввести?");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];

        System.out.println("Введите целые числа через пробел" + "и нажмите <Enter> ");
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        boolean n = false;
        int t = 0;
        for (int x : nums) {
            char[] numchar = String.valueOf(Math.abs(x)).toCharArray();
            for (int i = 0; i < numchar.length; i++) {
                for (int j = i + 1; j < numchar.length; j++) {
                    if (numchar[i] == numchar[j]) n = true;
                    break;
                }
            }
            if (n) {
                t++;
                n = false;
            } else {
                System.out.println("Число состоящее из различных цифр " + x);
                break;
            }
        }
        if (t == size) System.out.println("Чисел состоящих из различных цифр нет");
    }
}
