package ua.kyslun.hw5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = swapRowsAndColumns(arr);
        for (int[] row : arr) {
            System.out.println("Исходный массив:" + Arrays.toString(row));
        }
        for (int[] row : result) {
            System.out.println("Результирующий массив:" + Arrays.toString(row));
        }
    }

    public static int[][] swapRowsAndColumns(int[][] arr) {
        int n = arr.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = arr[j][i];
            }
        }
        return result;
    }
}
