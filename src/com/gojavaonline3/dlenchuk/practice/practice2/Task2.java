package com.gojavaonline3.dlenchuk.practice.practice2;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(average(10, 1));
        System.out.println(average(2, 7));
        System.out.println(average(1, 8));
        try {
            System.out.println(average(-1, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(average(0, -1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(average(1, -1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(average(-1, 1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(average(-1, 1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int average(int value1, int value2) {
        if (value1 <= 0 || value2 <= 0) {
            throw new IllegalArgumentException("The values must be more then zero (" +
                    (value1 <= 0 ? "value1 = " + value1 + (value2 <= 0 ? "; " : "") : "") +
                    (value2 <= 0 ? "value2 = " + value2: "") + ")");
        }
        return (value1 + value2) / 2;
    }

}
