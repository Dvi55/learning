package ua.kyslun.hw15.Task3;

import lombok.Data;

@Data
public class Box implements Comparable<Box> {
    private double volume;

    public Box(double volume) {
        this.volume = volume;
    }

    @Override
    public int compareTo(Box otherBox) {
        // Правила сортировки:
        // 1) От большего к меньшему
        // 2) Если объем равен 0, поместить в начало списка
        if (this.volume == otherBox.volume) {
            return 0;
        } else if (this.volume == 0) {
            return -1;
        } else if (otherBox.volume == 0) {
            return 1;
        } else {
            return Double.compare(otherBox.volume, this.volume);
        }
    }
}
