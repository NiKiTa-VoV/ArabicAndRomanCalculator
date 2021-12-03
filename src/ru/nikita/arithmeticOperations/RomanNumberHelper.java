package ru.nikita.arithmeticOperations;

public class RomanNumberHelper {

    public static boolean isNumber(String symbol) {
        char[] chars = symbol.toCharArray();
        if (chars.length > 4 || chars.length < 1) {
            return false;
        }
        if (chars.length == 1) {
            char c = chars[0];
            return c == 'I' || c == 'X' || c == 'V';
        }
        if (chars.length == 2) {
            char c0 = chars[0];
            char c1 = chars[1];
            return (c0 == 'I' && (c1 == 'I' || c1 == 'V' || c1 == 'X')) || (c0 == 'V' && c1 == 'I');
        }
        if (chars.length == 3) {
            char c0 = chars[0];
            char c1 = chars[1];
            char c2 = chars[2];
            return (c0 == 'I' || c0 == 'V') && c1 == 'I' && c2 == 'I';
        }
        if (chars[0] == 86) {
            for (int i = 1; i < 4; i++) {
                if ((int) chars[i] != 73) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static int toNumber(String symbol) {
        switch (symbol) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                return 0;
        }
    }

    public static String toString(int number) {
        if (number == 0) {
            return "";
        }
        if (number <= 10) {
            switch (number) {
                case 1:
                    return "I";
                case 2:
                    return "II";
                case 3:
                    return "III";
                case 4:
                    return "IV";
                case 5:
                    return "V";
                case 6:
                    return "VI";
                case 7:
                    return "VII";
                case 8:
                    return "VIII";
                case 9:
                    return "IX";
                case 10:
                    return "X";
            }
        }
        switch (number / 10) {
            case 1:
                return "X" + toString(number % 10);
            case 2:
                return "XX" + toString(number % 10);
            case 3:
                return "XXX" + toString(number % 10);
            case 4:
                return "XL" + toString(number % 10);
            case 5:
                return "L" + toString(number % 10);
            case 6:
                return "LX" + toString(number % 10);
            case 7:
                return "LXX" + toString(number % 10);
            case 8:
                return "LXXX" + toString(number % 10);
            case 9:
                return "XC" + toString(number % 10);
            case 10:
                return "C";
        }
        return "";
    }
}
