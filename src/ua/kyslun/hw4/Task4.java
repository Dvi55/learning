package ua.kyslun.hw4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[2000];
        for (int i = 0; i < 2000; i++) {
            array[i] = (int) (Math.random() * 99 + 1);
        }
        System.out.println(evenIsZero(array));
    }

    public static String evenIsZero(int[] array) {
        int[] calculatingArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < calculatingArray.length; i++) {
            if (calculatingArray[i] % 2 == 0) {
                calculatingArray[i] = 0;
            }
        }
        return Arrays.toString(calculatingArray);
    }
}
