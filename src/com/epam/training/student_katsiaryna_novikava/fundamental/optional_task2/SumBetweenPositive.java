package com.epam.training.student_katsiaryna_novikava.fundamental.optional_task2;

import java.util.Scanner;

public class SumBetweenPositive {
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
        int k = 0;
        int sumRow = 0;
        int sum = 0;
        boolean first = false;
        boolean second = false;
        while (k < n) {
            for (int j = 0; j < n; j++) {
                if ((arrayOur[k][j] > 0) && (!first)) first = true;
                else if ((first) && (arrayOur[k][j] > 0)) second = true;
                else if (first && !second) sumRow = sumRow + arrayOur[k][j];
                else if (arrayOur[k][n-1]<=0 && (!second)) sumRow=0;
            }
            System.out.println("Сумма в " + (k + 1) + " строке " + sumRow);
            sum = sum + sumRow;
            sumRow = 0;
            first = false;
            second = false;
            k++;
        }
        System.out.println("Сумма элементов матрицы, распол-ных между 1м и 2м положит. элементами каждой строки равна " + sum);
    }
}
