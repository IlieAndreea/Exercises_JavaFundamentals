/** Implement the program which will be displaying on the standard output (screen) the character sequence as below:
 *
 **
 ***
 ****
 *****
 We want to receive as many rows as the value assigned to the variable n at the beginning of the program.
 Nested Loop */

package javafundamentals.statements;

public class AdditionalExercises14 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < n; i++) {
           for (int j = 0; j < i + 1; j++) {
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
