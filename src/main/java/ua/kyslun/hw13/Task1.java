package ua.kyslun.hw13;

import java.util.Arrays;

public class Task1 {
    //bubble sort
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        // Bubble Sort
        int[] arrBubbleSort = Arrays.copyOf(arr, arr.length);
        long startTimeBubbleSort = System.nanoTime();
        bubbleSort(arrBubbleSort);
        long endTimeBubbleSort = System.nanoTime();
        long executionTimeBubbleSort = endTimeBubbleSort - startTimeBubbleSort;
        System.out.println("Bubble Sort:");
        System.out.println("Sorted array: " + Arrays.toString(arrBubbleSort));
        System.out.println("Execution time: " + executionTimeBubbleSort + " nanoseconds");

        // QuickSort
        int[] arrQuickSort = Arrays.copyOf(arr, arr.length);
        long startTimeQuickSort = System.nanoTime();
        quickSort(arrQuickSort, 0, arrQuickSort.length - 1);
        long endTimeQuickSort = System.nanoTime();
        long executionTimeQuickSort = endTimeQuickSort - startTimeQuickSort;
        System.out.println("\nQuickSort:");
        System.out.println("Sorted array: " + Arrays.toString(arrQuickSort));
        System.out.println("Execution time: " + executionTimeQuickSort + " nanoseconds");
    }

    public static int[] bubbleSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return arr;
    }

    public static int[] quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
        return arr;
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
