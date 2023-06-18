package ua.kyslun.hw13;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestTask1 {
    @Test
    public void BubbleSortTest() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Task1.bubbleSort(new int[]{2, 3, 4, 5, 1}));
    }

    @Test
    public void BubbleSortEmptyTest() {
        assertArrayEquals(new int[]{}, Task1.bubbleSort(new int[]{}));
    }

    @Test
    public void BubbleSortOneElementTest() {
        assertArrayEquals(new int[]{1}, Task1.bubbleSort(new int[]{1}));
    }

    @Test
    public void QuickSortTest() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Task1.quickSort(new int[]{2, 3, 4, 5, 1}, 0, 4));
    }

    @Test
    public void QuickSortEmptyTest() {
        assertArrayEquals(new int[]{}, Task1.quickSort(new int[]{}, 0, 0));
    }

    @Test
    public void QuickSortOneElementTest() {
        assertArrayEquals(new int[]{1}, Task1.quickSort(new int[]{1}, 0, 0));
    }
}