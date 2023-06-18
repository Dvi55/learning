package ua.kyslun.hw13;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int target = 22;
        long startTimeBinarySearch = System.nanoTime();
        int indexBinarySearch = binarySearch(arr2, target);
        long endTimeBinarySearch = System.nanoTime();
        long executionTimeBinarySearch = endTimeBinarySearch - startTimeBinarySearch;
        System.out.println("\nBinary Search:");
        System.out.println("Target: " + target);
        System.out.println("Index: " + indexBinarySearch);
        System.out.println("Execution time: " + executionTimeBinarySearch + " nanoseconds");
    }

    public static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
}
