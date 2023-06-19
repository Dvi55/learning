package ua.kyslun.hw17;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(41, 21, 3, 42, 54, 655, -287, 228, -529, 10, 65, 65, 48, 95, 651, 98, 6, 5, 7, 57, 65, 465, 75, 67, 6875, 7657, 231, 9, -652);
        list.stream()
                .reduce(Integer::min)
                .get();
    }
}
