package calculator.operations;

public class Subtraction {

    public static double calculate(double a, double b) {
        if ((a-b)<0){
            System.out.println("Achtung! Das Ergebnis ist negativ.");
        }
        return a - b;
    }
}