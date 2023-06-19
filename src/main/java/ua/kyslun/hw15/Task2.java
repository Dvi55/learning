package ua.kyslun.hw15;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    //Реализовать утильный класс со статическими методами:
    //• getSum(List<Integer> numbers) - возвращает сумму элементов списка
    //• getOddNumber(List<Integer> numbers) - возвращает новый список нечетных чисел
    //• convertToStringList(List<Integer> numbers) - возвращает новый список строк
    //• doubling(List<String> strings) – возвращает новый список, в котором дублирует
    //каждую строку и конкатенирует ее
    //- input: “2”
    //- output: “22”
    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static List<Integer> getOddNumber(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                oddNumbers.add(numbers.get(i));
            }
        }
        return oddNumbers;
    }

    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> strings = new ArrayList<>();
        for (Integer number : numbers) {
            strings.add(number.toString());
        }
        return strings;
    }

    public static List<String> doubling(List<String> strings) {
        List<String> newStrings = new ArrayList<>();
        for (String string : strings) {
            newStrings.add(string + string);
        }
        return newStrings;
    }
}
