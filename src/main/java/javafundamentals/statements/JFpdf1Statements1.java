/** *Calculate sum of index value from 10 to 30, using for loop. */

package javafundamentals.statements;

public class JFpdf1Statements1 {
    public static void main(String[] args) {
        int value = 10;
        int sum = 0;
        for (int i = 10; i <= 30; i++) {
            sum = sum + value;
            value++;
        }
        System.out.println("The sum is: " + sum);

    }
}
