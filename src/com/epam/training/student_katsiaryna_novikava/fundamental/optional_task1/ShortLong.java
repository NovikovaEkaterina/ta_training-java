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
        int min1 = nums[0], max1 = nums[0];
        int min = (String.valueOf(Math.abs(nums[0]))).length();
        int max = (String.valueOf(Math.abs(nums[0]))).length();
        for (int x : nums) {
            if ((String.valueOf(Math.abs(x))).length() < min) {
                min = (String.valueOf(Math.abs(x))).length();
                min1 = x;
            }
        }
        for (int x : nums) {
            if ((String.valueOf(Math.abs(x))).length() > max) {
                max = (String.valueOf(Math.abs(x))).length();
                max1 = x;
            }
        }
        System.out.println("Самое короткое число " + min1 + " состоит из " + min + " чисел");
        System.out.println("Самое длинное число " + max1 + " состоит из " + max + " чисел");
    }
}
