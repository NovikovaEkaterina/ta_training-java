package com.epam.training.student_katsiaryna_novikava.fundamental.optional_task2;

import java.util.Scanner;

public class MaxNumbersElements {
    public static void main(String[] args) {
        System.out.println("Введите размерность матницы:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arrayOur = new int[n][n];
        System.out.println("Введите интервал рандома М [-М,+М] ");
        int M = scan.nextInt();
        System.out.println("Ваша матрица");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrayOur[i][j] = (int) (Math.random() * (M - (-M) + 1) + (-M));
                System.out.print(arrayOur[i][j] + " ");
            }
            System.out.print("\n");
        }
        int max = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arrayOur[i][j] < arrayOur[i][j + 1]) {
                    m++;
                    if (max < m) max = m;
                } else m = 0;
            }
        }
        System.out.println("Максимальное число возрастающих элементов матрицы, идущих подряд равно:" + max);
    }
}
