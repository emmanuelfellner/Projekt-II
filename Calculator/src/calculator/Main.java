package calculator;

import calculator.utils.InputHelper;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("=== Einfacher Taschenrechner ===");

        boolean weiter = true;

        while (weiter) {

            double number1 = InputHelper.readDouble("Erste Zahl: ");
            double number2 = InputHelper.readDouble("Zweite Zahl: ");

            System.out.println("Wähle Operation:");
            System.out.println("+  - Addition");
            System.out.println("-  - Subtraktion");

            String operator = InputHelper.readString("Operator: ");

            double result = calculator.calculate(number1, number2, operator);

            System.out.println("Ergebnis: " + result);

            String antwort = InputHelper.readString(
                    "Weitere Berechnung durchführen? (ja/nein): ");

            if (!antwort.equalsIgnoreCase("ja")) {
                weiter = false;
            }

            System.out.println();
        }

        System.out.println("Programm beendet.");
    }
}