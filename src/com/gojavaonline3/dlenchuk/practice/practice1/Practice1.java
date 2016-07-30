package com.gojavaonline3.dlenchuk.practice.practice1;

import java.util.Arrays;

public class Practice1 {

    private static final char[] CHAR_ARRAY = new char[]{'9', '1', '5', '2', '3'};
    private static final int[] NUMBER_ARRAY_ODD = new int[]{10, 16, 50, 25, 33, 56, 88};
    private static final int[] NUMBER_ARRAY_NON_ODD = new int[]{10, 16, 50, 12, 332, 56, 88};
    private static final int SNAKE_STEP = 3;
    private static final int[] NUMBER_SNAKE_ARRAY = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final int SPIRAL_GROUP = 4;
    private static final int SPIRAL_STEP = 4;
    private static final int[] NUMBER_SPIRAL_ARRAY = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};



    public static void main(String[] args) {
        System.out.println("Practice 1");
        System.out.println("Source CHAR_ARRAY: " + Arrays.toString(CHAR_ARRAY));
        System.out.println("1.1. Merge -> " + merge(CHAR_ARRAY));
        System.out.println("1.2. Sum Of Number Cipher -> " + sumOfNumberCipher(merge(CHAR_ARRAY)));
        System.out.println("1.3. Find A First Odd Number");
        System.out.println("\tSource NUMBER_ARRAY_ODD: " + Arrays.toString(NUMBER_ARRAY_ODD) + " => " +
                findFirstOddNumber(NUMBER_ARRAY_ODD));
        System.out.println("\tSource NUMBER_ARRAY_NON_ODD: " + Arrays.toString(NUMBER_ARRAY_NON_ODD) + " => " +
                findFirstOddNumber(NUMBER_ARRAY_NON_ODD));
        System.out.println("1.4. Find Max Element");
        System.out.println("\tSource : " + Arrays.toString(NUMBER_ARRAY_NON_ODD) + " => " +
                findMax(NUMBER_ARRAY_NON_ODD));
        System.out.println("1.5. Snake Traversal");
        System.out.println("\tSource : " + Arrays.toString(NUMBER_SNAKE_ARRAY) + " => " +
                Arrays.toString(snakeTraversal(NUMBER_SNAKE_ARRAY)));
        System.out.println("1.6. Spiral Traversal");
        System.out.println("\tSource : " + Arrays.toString(NUMBER_SPIRAL_ARRAY) + " => " +
                Arrays.toString(spiralTraversal(NUMBER_SPIRAL_ARRAY)));
    }

    public static int merge(char[] chars) {
        int result = 0;
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            result += Math.pow(10, (length - 1) - i) * Byte.valueOf(String.valueOf(chars[i]));
        }
        return result;
    }

    public static int sumOfNumberCipher(int number) {
        String numberStr = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            sum += Byte.valueOf(String.valueOf(numberStr.charAt(i)));
        }
        return sum < 10 ? sum : sumOfNumberCipher(sum);
    }

    public static int findFirstOddNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                return i;
            }
        }
        return -1;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int[] snakeTraversal(int[] numbers) {
        int length = numbers.length;
        int[] result = new int[length];
        int snakeCounter = 0;
        int step = SNAKE_STEP;
        for (int i = 0; i < length; i++) {
            result[i] = numbers[snakeCounter];
            if ((step > 0 && (length - 1) - snakeCounter < SNAKE_STEP) ||
                    (step < 0 && snakeCounter < SNAKE_STEP)) {
                if (snakeCounter + 1 >= length) {
                    break;
                } else {
                    snakeCounter++;
                    step *= -1;
                }
            } else {
                snakeCounter += step;
            }
        }
        return result;
    }

    public static int[] spiralTraversal(int[] numbers) {
        int length = numbers.length;
        int[] result = new int[length];
        int spiralCounter = 0;



        return result;
    }

}