package calculator.operations;

public class Division {

    public static double calculate(double a, double b) {
        if (b == 0) {
            throw  new ArithmeticException("Division by zero");
        } else return a / b;
    }

}
