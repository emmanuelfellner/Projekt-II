package calculator;

import calculator.utils.InputHelper;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("=== Einfacher Taschenrechner ===");

        double number1 = InputHelper.readDouble("Erste Zahl: ");
        double number2 = InputHelper.readDouble("Zweite Zahl: ");

        System.out.println("Wähle Operation:");
        System.out.println("+  - Addition");
        System.out.println("-  - Subtraktion");

        String operator = InputHelper.readString("Operator: ");

        double result = calculator.calculate(number1, number2, operator);

        System.out.println("Ergebnis: " + result);
    }
}