package ua.kyslun.hw10;

public class PowRealization {
    public static void main(String[] args) {
        Pow pow;
        pow = (number, index) -> {
            int result = 1;
            for (int i = 1; i <= index; i++) {
                result *= number;
            }
            return result;
        };
        System.out.println(pow.pow(5, 2));
    }
}
