package ua.kyslun.hw14;

public class Task2 {
    public static <T> void printAnyArrayValue(T[] value) {
        for (T item : value) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public <T> void printAnyValue(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.printAnyValue(5);
        task2.printAnyValue("Hello");
        printAnyArrayValue(new Integer[]{1, 2, 3, 4, 5});
        printAnyArrayValue(new String[]{"Hello", "World"});
    }
}