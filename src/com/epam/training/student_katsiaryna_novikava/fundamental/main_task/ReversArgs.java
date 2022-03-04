package com.epam.training.student_katsiaryna_novikava.fundamental.main_task;

public class ReversArgs {
    public static void main(String[] args) {

        int[] arg = {4, 5, 6, 7, 8, 9};

        for (int i = arg.length-1; i >= 0; i--) {
            System.out.println(arg[i]);
        }
    }
}
