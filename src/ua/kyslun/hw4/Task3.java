package ua.kyslun.hw4;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = (int) (Math.random() * 99 + 1);
        }
        System.out.println("Amount of composite numbers is " + countComposite(array));
    }

    public static int countComposite(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (!isPrime(j)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}

