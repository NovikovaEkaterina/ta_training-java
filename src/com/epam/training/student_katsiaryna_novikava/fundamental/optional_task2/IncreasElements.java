package com.epam.training.student_katsiaryna_novikava.fundamental.optional_task2;

import java.util.Scanner;

public class IncreasElements {
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
        System.out.println("Введите номер столбца для упорядочивания от 0 до " + (n - 1));
        int k = scan.nextInt();

        for (int i = 0; i < n; i++)
            for (int x = 0; x < n; x++) {
                if (arrayOur[i][k] > arrayOur[x][k]) {
                    for (int j = 0; j < n; j++) {
                        int midl = arrayOur[x][j];
                        arrayOur[x][j] = arrayOur[i][j];
                        arrayOur[i][j] = midl;
                    }
                }
            }
        System.out.println("Результат:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayOur[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
