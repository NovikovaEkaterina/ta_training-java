package com.epam.training.student_katsiaryna_novikava.fundamental.main_task;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello, "+ name+"!");
    }
}
