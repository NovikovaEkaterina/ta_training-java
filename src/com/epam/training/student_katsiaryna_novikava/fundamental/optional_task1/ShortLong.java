package com.epam.training.student_katsiaryna_novikava.fundamental.optional_task1;

import java.util.Scanner;

public class ShortLong {
    public static void main(String[] args) {
        System.out.println("Сколько чисел вы собираетесь ввести?");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];

        System.out.println("Введите целые числа через пробел" + "и нажмите <Enter> ");
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        String minStr = null, maxStr = null;
        int minc, maxc;
        int min = nums[0];
        int max = nums[0];
        for (int x : nums) {
            if (x < min) min = x;
        }
        minStr = String.valueOf(min);
        minc = minStr.length();
        for (int x : nums) {
            if (x > max) max = x;
        }
        maxStr = String.valueOf(max);
        maxc = maxStr.length();

        System.out.println("Самое короткое число " + min + " состоит из " + minc + " чисел");
        System.out.println("Самое длинное число " + max + " состоит из " + maxc + " чисел");
    }
}
