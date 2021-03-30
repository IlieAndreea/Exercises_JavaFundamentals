/** Write a Java program to print the following:  (2 methods)
               1
              222
             33333
            4444444
           555555555
 */

package javafundamentals.statements;

public class CodingExercises7 {
    public static void main(String[] args) {
        System.out.println("Method 1:");
        int n = 5;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print(i + 1);
            }
            for(int l = 0; l < i; l++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

        System.out.println("\nMethod 2:");
        int rows = 5;
        int k = 0;
        int pyramid = 1;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print(pyramid);
                ++k;
            }
            System.out.println();
            pyramid++;
        }
    }
}
