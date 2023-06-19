package ua.kyslun.hw17.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Box box = new Box(i * 10);
            box.addItem(new Item("Item 1", 10));
            box.addItem(new Item("Item 2", 5));
            box.addItem(new Item("Item 3", 15));
            boxes.add(box);
        }

//         List<Box> filteredBoxes = boxes.stream()
//                .filter(box -> box.isSuitable(50))
//                .toList();
//
//        List<Item> allItems = filteredBoxes.stream()
//                .flatMap(box -> box.getItems().stream())
//                .collect(Collectors.toList());
        List<Item> allItems = boxes.stream()
                .filter(box -> box.isSuitable(50))
                .flatMap(box -> box.getItems().stream())
                .sorted(Comparator.comparingInt(Item::getCost))
                .toList();

        allItems.forEach(item -> System.out.println(item.getCost()));
    }
}


