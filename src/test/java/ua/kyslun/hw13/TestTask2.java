package ua.kyslun.hw13;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestTask2 {
    @Test
    public void testBinarySearch() {
        Assertions.assertEquals(Task2.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5), 4);
    }

    @Test
    public void testBinarySearchFalse() {
        Assertions.assertEquals(Task2.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10), -1);
    }

    @Test
    public void testBinarySearchEmpty() {
        Assertions.assertEquals(Task2.binarySearch(new int[]{}, 0), -1);

    }

    @Test
    public void testBinarySearchIncorrect() {
        Assertions.assertNotEquals(Task2.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3), 4);
    }
}
