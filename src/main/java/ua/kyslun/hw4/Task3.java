package ua.kyslun.hw4;

import java.math.BigInteger;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = (int) (Math.random() * 99 + 1);
        }
        System.out.println("Amount of composite numbers is " + compositeNumberCounter(array));
    }

    public static int compositeNumberCounter(int[] array) {
        int counter = 0;
        for (int number : array) {
            BigInteger bigInteger = BigInteger.valueOf(number);
            if (!(bigInteger.isProbablePrime(2))) {
                counter++;
            }
        }
        return counter;
    }
}

