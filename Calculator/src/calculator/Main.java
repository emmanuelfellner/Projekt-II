package calculator;

import calculator.utils.InputHelper;

public class Main {

    static void main() {

        Calculator calculator = new Calculator();
        final String RESET = "\u001B[0m";
        final String BRIGHT_GREEN = "\u001B[92m";
        final String BOLD = "\u001B[1m";
        System.out.println(BRIGHT_GREEN + BOLD + "=== Einfacher Taschenrechner ===" + RESET);
        //System.out.println("=== Einfacher Taschenrechner ===");

        double number1 = InputHelper.readDouble("Erste Zahl: ");
        double number2 = InputHelper.readDouble("Zweite Zahl: ");

        System.out.println("Geben Sie eine Operation ein:");
        System.out.println("Wählen Sie '+' für Addition");
        System.out.println("oder wählen Sie '-' für Subtraktion");

        String operator = InputHelper.readString("Ihr gewählter Operator: ");

        double result = calculator.calculate(number1, number2, operator);
        final String UNDERLINE = "\u001B[4m";
        System.out.println("Ergebnis: " + UNDERLINE + result);
    }
}