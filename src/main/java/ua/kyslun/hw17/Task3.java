package ua.kyslun.hw17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        List<String> dateList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            dateList.add(getRandomDate());
        }
        System.out.println(dateList.toString());
        boolean anyMatch = dateList.stream().anyMatch(it -> it.equals("2023"));
        System.out.println("Date with 2023 year is present - " + anyMatch);
    }

    private static String getRandomDate() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int year = random.nextInt(2000, 2023);
        int month = random.nextInt(12) + 1;
        int day = random.nextInt(28) + 1;
        return sb.append(year).append('/').append(month).append('/').append(day).toString();
    }
}

