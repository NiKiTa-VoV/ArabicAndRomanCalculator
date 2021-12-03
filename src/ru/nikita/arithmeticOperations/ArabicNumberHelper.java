package ru.nikita.arithmeticOperations;

public class ArabicNumberHelper {

    public static boolean isNumber(String symbol) {
        try {
            Integer.parseInt(symbol);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int toNumber(String symbol) {
        return Integer.parseInt(symbol);
    }
}
