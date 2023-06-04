package ua.kyslun.hw14;

import java.util.Arrays;

public class MySet<T> {
    private T[] array;
    private int size;

    public MySet(int initialSize) {
        array = (T[]) new Object[initialSize];
        size = 0;
    }

    public void add(T element) {
        if (!contains(element) && suitableSize()) {
            array[size] = element;
            size++;
        } else if (contains(element)) {
            System.out.println("This element is already in the set");
        } else if (!suitableSize()) {
            Arrays.copyOf(array, array.length * 2);
            array[size] = element;
            size++;
        }
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element) && array[i] != null)
                return true;
        }
        return false;
    }

    public boolean suitableSize() {
        return size < array.length;
    }

    public T get(int index) {
        if (index < size && index >= 0)
            return (T) array[index];
        else
            throw new IndexOutOfBoundsException("Index out of bounds");
    }


    @Override
    public String toString() {
        T[] trimmedArray = Arrays.copyOf(array, size);
        return "MySet{" +
                "array=" + Arrays.toString(trimmedArray) +
                '}';
    }
}




