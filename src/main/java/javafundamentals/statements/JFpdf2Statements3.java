package javafundamentals.statements;

public class JFpdf2Statements3 {
    public static void main(String[] args) {
        // while loop example
        int x = 10;
        while (x < 20) {
            System.out.println("x1 is: " + x);
            x++;
        }

        // do- while loop examples
        do {
            System.out.println("\nx2 is: " + x + "\n");
            x++;
        } while (x < 20);

        int y = 5;
        do {
            System.out.println("y is: " + y);
            y++;
        } while (y <10);
    }
}
