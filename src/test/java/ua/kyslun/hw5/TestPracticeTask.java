package ua.kyslun.hw5;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.kyslun.hw5.practice.Task1.totalPrice;
import static ua.kyslun.hw5.practice.Task2.boysGrowthAverage;
import static ua.kyslun.hw5.practice.Task2.girlsGrowthAverage;

public class TestPracticeTask {
    @Test
    public void testTotalPrice() {
        int[] price = {500, 1500, 1800, 1200, 600, 200, 700};
        assertEquals(4500, totalPrice(price));
    }

    @Test
    public void testBoysGrowthAverage() {
        int[] arr = {-130, 160, -130, -100, 50};
        assertEquals(120, boysGrowthAverage(arr));
    }

    @Test
    public void testGirlsGrowthAverage() {
        int[] arr = {-130, 160, -130, -100, 40, 200, 60};
        assertEquals(115, girlsGrowthAverage(arr));
    }

}
