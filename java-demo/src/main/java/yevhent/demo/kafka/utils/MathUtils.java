package yevhent.demo.kafka.utils;

public class MathUtils {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number");
        }
        return Math.sqrt(a);
    }

    // Is odd number?
    public static boolean isOdd(int a) {
        return a % 2 != 0;
    }
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static void printFields(int number, double ratio, String message, Object info) {
        System.out.println(String.format(
                "number: %d, ratio: %f, message: %s, info: %s",
                message, ratio, info, number));
    }
}
