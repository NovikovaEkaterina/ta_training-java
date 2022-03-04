package com.epam.training.student_katsiaryna_novikava.fundamental.main_task;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        System.out.println("Введите числоот 1 до 12 и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        switch (month) {
            case 1:
                System.out.println(" Это месяц январь");
                break;
            case 2:
                System.out.println(" Это месяц февраль");
                break;
            case 3:
                System.out.println(" Это месяц март");
                break;
            case 4:
                System.out.println(" Это месяц апрель");
                break;
            case 5:
                System.out.println(" Это месяц май");
                break;
            case 6:
                System.out.println(" Это месяц июнь");
                break;
            case 7:
                System.out.println(" Это месяц июль");
                break;
            case 8:
                System.out.println(" Это месяц август");
                break;
            case 9:
                System.out.println(" Это месяц сентябрь");
                break;
            case 10:
                System.out.println(" Это месяц октябрь");
                break;
            case 11:
                System.out.println(" Это месяц ноябрь");
                break;
            case 12:
                System.out.println(" Это месяц декабрь");
                break;
            default:
                System.out.println("Число не корректно для обозначения месяца");
        }
    }
}
