package ua.kyslun.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int raw = 5;
        int col = 5;
        int[][] arr = new int[raw][col];
        int[][] newArray = fillArray(arr);
        for (int[] raws : newArray) {
            System.out.println(Arrays.toString(raws));
        }
    }

    public static int[][] fillArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] workArray = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                workArray[i][j] = j + 1;
            }
            if (i % 2 == 1) {
                for (int j = 0; j < cols; j++) {
                    workArray[i][j] = -workArray[i][j];
                }
            }
        }
        return workArray;
    }
}
