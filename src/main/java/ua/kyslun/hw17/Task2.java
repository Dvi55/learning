package ua.kyslun.hw17;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;


public class Task2 {
    public static void main(String[] args) {
        Random randomizer = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(randomizer.nextInt(-10000, 10000));
        }
        IntSummaryStatistics stats = list.stream()
                .filter(Task2::validate)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
    }

    private static boolean validate(int number) {
        return number >= 0;
    }
}
