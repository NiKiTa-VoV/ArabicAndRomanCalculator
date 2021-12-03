package ru.nikita.arithmeticOperations;

public class RomanNumberOperations {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        if (a < b) {
            throw new IllegalArgumentException("Второче число больше первого");
        }
        if (a == b) {
            throw new IllegalArgumentException("Оба числа равны");
        }
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
