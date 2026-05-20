package calculator.utils;

import java.util.Scanner;

public class InputHelper {

    private static final Scanner scanner = new Scanner(System.in);

    public static double readDouble(String text) {
        while (true) {
            System.out.print(text);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
                scanner.next(); // ungültige Eingabe verwerfen
            }
        }
    }

    public static String readString(String text) {
        System.out.print(text);
        return scanner.next();
    }
}