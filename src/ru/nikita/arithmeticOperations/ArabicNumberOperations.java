package ru.nikita.arithmeticOperations;

public class ArabicNumberOperations {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Деление на ноль");
        }
        return a / b;
    }
}
