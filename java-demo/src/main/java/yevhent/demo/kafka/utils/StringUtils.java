package yevhent.demo.kafka.utils;

public class StringUtils {

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

}
