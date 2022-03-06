package com.epam.training.student_katsiaryna_novikava.fundamental.optional_task1;

import java.util.Scanner;

public class IncreaseOrder {
    public static void main(String[] args) {
        System.out.println("Сколько чисел вы собираетесь ввести?");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];

        System.out.println("Введите целые числа через пробел" + "и нажмите <Enter> ");
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        boolean check = false;
        int ex;
        while (!check) {
            check = true;
            for (int i = 0; i < size-1; i++) {
                if (nums[i] < nums[i + 1]) {
                    ex = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = ex;
                    check = false;
                }
            }
        }
       for (int j=0;j<size;j++){
            System.out.print(nums[j] + " ");
        }
    }
}