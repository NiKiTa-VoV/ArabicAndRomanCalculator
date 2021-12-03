package ru.nikita;

import ru.nikita.arithmeticOperations.ArabicNumberHelper;
import ru.nikita.arithmeticOperations.RomanNumberHelper;

public class Operator {
    private boolean isRomanNumber;
    private final int number;

    public Operator(int number, boolean isRomanNumber) {

        this.number = number;
        this.isRomanNumber = isRomanNumber;
    }

    public Operator(String symbol) {
        isRomanNumber = false;
        if (!RomanNumberHelper.isNumber(symbol)) {
            if (ArabicNumberHelper.isNumber(symbol)) {
                number = ArabicNumberHelper.toNumber(symbol);
            } else {
                throw new IllegalArgumentException("Оператор не является числом");
            }
        } else {
            number = RomanNumberHelper.toNumber(symbol);
            isRomanNumber = true;
        }
        if (number <= 0 || number > 10) {
            throw new IllegalArgumentException("Число меньше 1 или больше 10");
        }
    }

    public int getNumber() {
        return number;
    }

    public boolean isRomanNumber() {
        return isRomanNumber;
    }
}
