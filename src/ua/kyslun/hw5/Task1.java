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
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                workArray[i][j] = j + 1;
                if (i % 2 == 1) {
                    workArray[i][j] = -workArray[i][j];
                }
            }
        }
        return workArray;
    }
}
