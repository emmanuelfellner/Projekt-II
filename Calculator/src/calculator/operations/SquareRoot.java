package calculator.operations;

public class SquareRoot {
    //Methode
    public static double calculate (double a) {
        if (a < 0)
            System.out.println("Fehler: negative Zahl!");

        return Math.sqrt(a);
    }
}
