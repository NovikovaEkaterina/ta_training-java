package com.epam.training.student_katsiaryna_novikava.fundamental.optional_task1;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Сколько чисел вы собираетесь ввести?");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];

        System.out.println("Введите целые числа через пробел" + "и нажмите <Enter> ");
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        int even = 0, odd = 0;
        for (int x : nums) {
            char[] numchar = String.valueOf(Math.abs(x)).toCharArray();
            for (int i = 0; i < numchar.length; i++) {
                if ((Integer.parseInt(String.valueOf(numchar[i]))) % 2 == 0) evenCount++;
                else oddCount++;
            }
            if (evenCount == numchar.length)
                even++;
            if (evenCount == oddCount) odd++;
            evenCount = 0;
            oddCount = 0;
        }
        if (even > 0)
            System.out.println("Количество чисел,в котором все цифры четные: " + even);
        else System.out.println("Чисел,в которых все цифры четные нет.");
        if (odd > 0)
            System.out.println("Количество чисел,с равным числом четных и нечетных цифр:  " + odd);
        else System.out.println("Чисел,с равным числом  четных и нечетные цифр, нет ");
    }
}
