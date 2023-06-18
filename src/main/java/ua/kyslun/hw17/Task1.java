package ua.kyslun.hw17;

import static java.util.Arrays.stream;

public class Task1 {
    //Задан массив строк. Используя средства StreamAPI отсортировать строки в
    //лексикографическом порядке и вывести в консоль.
    public static void main(String[] args) {
        String[] arr = {"Abffvb", "a", "b", "c", "d", "e", "f", "kjdfnbskf", "brekfjnvarf", "brek", "ireuqwa", "a", "zaffgasd", "MYyqro", "GTLIhT", "GIMhhD", "jzJA", "BngaMqf"};
        stream(arr)
                .sorted()
                .forEach(System.out::println);
    }
}
