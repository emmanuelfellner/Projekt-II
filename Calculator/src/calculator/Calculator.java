package calculator;

import calculator.operations.Addition;
import calculator.operations.Subtraction;

public class Calculator {

    public double calculate(double a, double b, String operator) {

        return switch (operator) {
            case "+" -> Addition.calculate(a, b);
            case "-" -> Subtraction.calculate(a, b);
            default -> {
                System.out.println("Ungültiger Operator!");
                yield 0;
            }
        };
    }
}
