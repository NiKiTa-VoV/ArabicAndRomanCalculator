package ru.nikita.arithmeticOperations;

import ru.nikita.Operator;

public class NumberOperations {
    public static Operator sum(Operator a, Operator b) {
        if (a.isRomanNumber()) {
            return new Operator(RomanNumberOperations.sum(a.getNumber(), b.getNumber()), true);
        }
        return new Operator(ArabicNumberOperations.sum(a.getNumber(), b.getNumber()), false);
    }

    public static Operator subtraction(Operator a, Operator b) {
        if (a.isRomanNumber()) {
            return new Operator(RomanNumberOperations.subtraction(a.getNumber(), b.getNumber()), true);
        }
        return new Operator(ArabicNumberOperations.subtraction(a.getNumber(), b.getNumber()), false);
    }

    public static Operator multiplication(Operator a, Operator b) {
        if (a.isRomanNumber()) {
            return new Operator(RomanNumberOperations.multiplication(a.getNumber(), b.getNumber()), true);
        }
        return new Operator(ArabicNumberOperations.multiplication(a.getNumber(), b.getNumber()), false);
    }

    public static Operator division(Operator a, Operator b) {
        if (a.isRomanNumber()) {
            return new Operator(RomanNumberOperations.division(a.getNumber(), b.getNumber()), true);
        }
        return new Operator(ArabicNumberOperations.division(a.getNumber(), b.getNumber()), false);
    }
}
