package ua.kyslun.hw17.task5;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private final List<Item> items;
    private final int size;

    public Box(int size) {
        this.items = new ArrayList<>();
        this.size = size;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean isSuitable(int minSizeLimit) {
        return size >= minSizeLimit;
    }

    public List<Item> getItems() {
        return items;
    }
}


