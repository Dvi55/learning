package ua.kyslun.hw14;

public class Task2 {
    public static <T> void printAnyArrayValue(T[] value) {
        for (T item : value) {
            System.out.println(item);
        }
    }

    public static <T> void printAnyValue(T value) {
        System.out.println(value);
    }
}
