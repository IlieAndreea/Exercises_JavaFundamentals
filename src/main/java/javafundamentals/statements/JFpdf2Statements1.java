package javafundamentals.statements;

public class JFpdf2Statements1 {
    public static void main(String[] args) {
        // if- then statement examples
        int temperature = 40;
        // example 1
        if (temperature > 100) {
            System.out.println("The water is boiling.");
        } else System.out.println("The water isn't boiling.");
        // example 2
        if (temperature > 100) {
            System.out.println("Apa fierbe!");
        } else if (temperature < 50) {
            System.out.println("Apa se incalzeste!");
        } else System.out.println("Apa este aproape de fierbere!");
        // example 3
        if (temperature > 100) {
            System.out.println("The water is boiling.");
        } else if (temperature == 100 || temperature >= 50) {
            System.out.println("The water is very hot.");
        } else System.out.println("The water is getting warmer.");
    }
}
