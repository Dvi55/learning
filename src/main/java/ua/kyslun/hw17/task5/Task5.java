package ua.kyslun.hw17.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        // Создаем коллекцию Box и инициализируем ее 10 коробками
        List<Box> boxes = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Box box = new Box(i * 10);
            box.addItem(new Item("Item 1", 10));
            box.addItem(new Item("Item 2", 5));
            box.addItem(new Item("Item 3", 15));
            boxes.add(box);
        }

        // Применяем фильтр к коллекции коробок по размеру
        List<Box> filteredBoxes = boxes.stream()
                .filter(box -> box.isSuitable(50))
                .collect(Collectors.toList());

        // У оставшихся коробок взять коллекции Item
        List<Item> allItems = filteredBoxes.stream()
                .flatMap(box -> box.getItems().stream())
                .collect(Collectors.toList());

        // Отсортировать по цене
        allItems.sort(Comparator.comparingInt(Item::getCost));

        // Вывести цены в консоль
        allItems.forEach(item -> System.out.println(item.getCost()));
    }
}


