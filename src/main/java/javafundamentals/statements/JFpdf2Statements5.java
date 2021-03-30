/** Compare two integers and return the greater one. */

package javafundamentals.statements;

public class JFpdf2Statements5 {
    public static void main(String[] args) {
        int x = 5;
        int y = 15;

        if (x == y) {
            System.out.println("\nThe two integers are equal! Please enter two different integers!");
        } else if (x < y) {
            System.out.println("\n" + y + " is greater than " + x);
        } else System.out.println("\n" + x + " is greater than " + y);

        compareTwoNumbers(5, 15);
    }

    public static boolean compareTwoNumbers(int a, int b) {
        if (a > b) {
            System.out.println(a + "este mai mare decat " + b);
            return true;
        } else System.out.println(b + " este mai mare decat " + a);
        return false;
    }
}
