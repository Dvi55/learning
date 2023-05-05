package ua.kyslun.hw5;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static ua.kyslun.hw5.Task2.isNonIncreasing;

public class TestIsNonIncreasing {
    @Test
    public void testDecreasingArray() {
        int[] arr = {5, 4, 3, 2, 1};
        assertTrue(isNonIncreasing(arr));
    }

    @Test
    public void testNonDecreasingArray() {
        int[] arr = {4, 6, 8, 1, 3, 4};
        assertFalse(isNonIncreasing(arr));
    }
    @Test
    public void testZeroArray() {
        int[] arr = {};
        assertTrue(isNonIncreasing(arr));
    }
    @Test
    public void testSimilarArray() {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        assertTrue(isNonIncreasing(arr));
    }
}