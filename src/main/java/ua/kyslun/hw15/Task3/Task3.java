package ua.kyslun.hw15.Task3;

import java.util.Set;
import java.util.TreeSet;

public class Task3 {
    //- Создать класс Box содержащий параметр объем.
    //- Создать отсортированный Set и поместить в него 5+ объектов Box
    //- Правила сортировки:
    //1) От большего к меньшему
    //2) Если объем равен 0, поместить в начало списка
    public static void main(String[] args) {
        Set<Box> boxSet = new TreeSet<>();
        boxSet.add(new Box(5.0));
        boxSet.add(new Box(3.0));
        boxSet.add(new Box(0.0));
        boxSet.add(new Box(2.0));
        boxSet.add(new Box(1.0));

        for (Box box : boxSet) {
            System.out.println(box.getVolume());
        }
    }
}