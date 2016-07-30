package com.gojavaonline3.dlenchuk.practice.practice2;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("average(10, 5) = " + average(10, 5));
        System.out.println("average(2, -7) = " + average(2, -7));
        System.out.println("average(-11, 8) = " + average(-11, 8));
        System.out.println("average(-15, -20) = " + average(-15, -20));
        System.out.println("average(4, 6) = " + average(4, 6));
        System.out.println("average(2, -5) = " + average(2, -5));
        System.out.println("average(140, -150) = " + average(140, -150));
        System.out.println("average(8, 7) = " + average(8, 7));
    }

    private static int average(int value1, int value2) {
        return (value1 + value2) / 2;
    }

}
