package ua.kyslun.hw5;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] secondArray = {5, 6, 2, 7, 5, 9, 3, 7, 1};
        System.out.println(isNonIncreasing(array));
        System.out.println(isNonIncreasing(secondArray));
    }

    public static boolean isNonIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
