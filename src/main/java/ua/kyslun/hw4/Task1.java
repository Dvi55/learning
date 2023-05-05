package ua.kyslun.hw4;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        for (int i = 0; i < 400; i++) {
            array[i] = (int) (Math.random() * 9 + 1);
        }
        System.out.println(arithmeticAverage(array) + "is the arithmetic mean of the array");
        System.out.printf("%.3f", geometricAverage(array));
        System.out.print(" is the geometric mean of the array");
    }

    public static double
    arithmeticAverage(int[] array) {
        double start = array[0];
        for (int i = 1; i < array.length; i++) {
            start += array[i];
        }
        return start / array.length;
    }

    public static double geometricAverage(int[] array) {
        double start = 1;
        for (int j : array) {
            start *= j;
        }
        start = Math.pow(start, 1.0 / array.length);
        return start;
    }
}
