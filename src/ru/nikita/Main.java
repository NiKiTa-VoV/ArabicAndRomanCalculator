package ru.nikita;

import ru.nikita.arithmeticOperations.NumberOperations;
import ru.nikita.arithmeticOperations.RomanNumberHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] symbols = in.nextLine().trim().split(" ");
        if (symbols.length != 3) {
            throw new IllegalArgumentException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        Operator leftOperator = new Operator(symbols[0]);
        Operator rightOperator = new Operator(symbols[2]);
        if (leftOperator.isRomanNumber() != rightOperator.isRomanNumber()) {
            throw new IllegalArgumentException("Числа разных видов");
        }
        char operand = symbols[1].toCharArray()[0];
        Operator result;
        switch (operand) {
            case '+':
                result = NumberOperations.sum(leftOperator, rightOperator);
                break;
            case '-':
                result = NumberOperations.subtraction(leftOperator, rightOperator);
                break;
            case '*':
                result = NumberOperations.multiplication(leftOperator, rightOperator);
                break;
            case '/':
                result = NumberOperations.division(leftOperator, rightOperator);
                break;
            default:
                throw new IllegalArgumentException("Операнд является не корректным");
        }
        if (result.isRomanNumber()) {
            System.out.println(RomanNumberHelper.toString(result.getNumber()));
        } else {
            System.out.println(result.getNumber());
        }
    }
}
