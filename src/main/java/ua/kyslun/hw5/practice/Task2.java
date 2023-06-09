package ua.kyslun.hw5.practice;

public class Task2 {
    public static void main(String[] args) {
        int[] heights = {165, 155, 198, -176, -164, -154, 205, -185};
        System.out.println("girls avg: " + calcGirlsAvgHeight(heights));
        System.out.println("boys avg: " + calcBoysAvgHeight(heights));
    }

    public static double calcBoysAvgHeight(int[] heights) {
        return calc(heights, true);
    }

    public static double calcGirlsAvgHeight(int[] heights) {
        return calc(heights, false);
    }

    public static double calc(int[] heights, boolean isBoy) {
        double sum = 0;
        int amount = 0;
        for (int height : heights) {
            if ((isBoy && height < 0) || (!isBoy && height > 0)) {
                amount++;
                sum += height;
            }
        }
        return Math.abs(sum / amount);
    }
}
