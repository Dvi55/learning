package ua.kyslun.hw4;

import java.math.BigInteger;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = (int) (Math.random() * 99 + 1);
        }

        System.out.println("Amount of simple numbers " + simpleNumbersCounter(array));
    }

    public static int simpleNumbersCounter(int[] array) {
        int counter = 0;
        for (int number : array) {
            BigInteger bigInteger = BigInteger.valueOf(number);
            if (bigInteger.isProbablePrime(3)) {
                counter++;
            }
        }
        return counter;
    }
}
