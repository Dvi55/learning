package ua.kyslun.hw5;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.kyslun.hw5.practice.Task1.calcSumConditionally;

public class TestTotalPrice {
    @Test
    public void testTotalPrice() {
        double[] price = {500, 1500, 1800, 1200, 600, 200, 700};
        assertEquals(4500, calcSumConditionally(price));
    }
    @Test
    public void testTotalPriceUnsuitableArr() {
        double[] price = {500, 500, 800, 200, 600, 200, 700};
        assertEquals(0, calcSumConditionally(price));
    }
    @Test
    public void testTotalPriceZeroArr() {
        double[] price = {};
        assertEquals(0, calcSumConditionally(price));
    }
}
