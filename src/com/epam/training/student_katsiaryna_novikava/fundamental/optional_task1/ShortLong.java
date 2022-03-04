package com.epam.training.student_katsiaryna_novikava.fundamental.optional_task1;

import java.util.Scanner;

public class ShortLong {
    public static void main(String[] args) {
        System.out.println("Сколько чисел вы собираетесь ввести?");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] nums = new String[size];

        System.out.println("Введите целые числа через пробел" + "и нажмите <Enter> ");
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextLine();
//            System.out.println(nums[i]);
        }
        String minStr = null, maxStr = null;
        int min = nums[0].length();
        int max = nums[0].length();
        for (int j = 0; j < size; j++) {
            if (nums[j].length() < min) {
                min = nums[j].length();
                minStr = nums[j];
            }
            if (nums[j].length() > max) {
                max = nums[j].length();
                maxStr = nums[j];

            }
        }
        System.out.println("Самое короткое число " + minStr + " состоит из " + min + "чисел");
        System.out.println("Самое длинное число " + maxStr + " состоит из " + max + "чисел");
    }
}
