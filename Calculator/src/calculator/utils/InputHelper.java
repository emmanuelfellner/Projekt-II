package calculator.utils;

import java.util.Scanner;

public class InputHelper {

    private static final Scanner scanner = new Scanner(System.in);

    public static double readDouble(String text) {
        System.out.print(text);
        return scanner.nextDouble();
    }

    public static String readString(String text) {
        System.out.print(text);
        return scanner.next();
    }
}