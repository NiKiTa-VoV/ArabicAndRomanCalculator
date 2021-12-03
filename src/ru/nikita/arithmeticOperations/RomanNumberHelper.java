package ru.nikita.arithmeticOperations;

public class RomanNumberHelper {

    public static boolean isNumber(String symbol) {
        char[] chars = symbol.toCharArray();
        if (chars.length > 1) {
            return false;
        }
        char c = chars[0];
        return c >= 8544 && c <= 8553;
    }

    public static int toNumber(String symbol) {
        char[] chars = symbol.toCharArray();
        return chars[0] - 8543;
    }

    public static String toString(int number) {
        if (number == 0) {
            return "";
        }
        if (number <= 10) {
            return "" + (char) (number + 8543);
        }
        switch (number / 10) {
            case 1:
                return (char) 8553 + "" + toString(number % 10);
            case 2:
                return (char) 8553 + "" + (char) 8553 + "" + toString(number % 10);
            case 3:
                return (char) 8553 + "" + (char) 8553 + "" + (char) 8553 + "" + toString(number % 10);
            case 4:
                return (char) 8553 + "" + (char) 8556 + "" + toString(number % 10);
            case 5:
                return (char) 8556 + "" + toString(number % 10);
            case 6:
                return (char) 8556 + "" + (char) 8553 + "" + toString(number % 10);
            case 7:
                return (char) 8556 + "" + (char) 8553 + "" + (char) 8553 + "" + toString(number % 10);
            case 8:
                return (char) 8556 + "" + (char) 8553 + "" + (char) 8553 + "" + (char) 8553 + "" + toString(number % 10);
            case 9:
                return (char) 8553 + "" + (char) 8557 + "" + toString(number % 10);
            case 10:
                return (char) 8557 + "" + toString(number % 10);
        }
        return "";
    }
}
