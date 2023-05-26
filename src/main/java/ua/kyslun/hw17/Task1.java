package ua.kyslun.hw17;

import java.util.Comparator;

import static java.util.Arrays.stream;

public class Task1 {
    //Задан массив строк. Используя средства StreamAPI отсортировать строки в
    //лексикографическом порядке и вывести в консоль.
    public static void main(String[] args) {
        String[] arr = {"Abffvb", "a", "b", "c", "d", "e", "f", "kjdfnbskf", "brekfjnvarf", "brek", "ireuqwa"};
         stream(arr)
                .sorted(Comparator.comparing(array -> array.charAt(0)))
                .forEach(System.out::println);

    }
}
