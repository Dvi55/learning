package ua.kyslun.hw5.practice;

public class Task1 {
    public static void main(String[] args) {
        double[] prices = {1234, 100.4, 222.22, 1111,
                111, 15.9, 20000.99, 1999.99,
                12.50, 66.3, 650_000, 650001};
        System.out.println(calcSumConditionally(prices));
    }

    public static double calcSumConditionally(double[] prices) {
        double sum = 0;
        for (double price : prices) {
            if (price > 1000) {
                sum += price;
            }
        }
        return sum;
    }
}
