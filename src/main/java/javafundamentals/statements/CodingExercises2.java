/**Write a Java program that lists all even numbers from 1 to 100 (3 methods)
   Output: 2, 4, 6, 8, ...,100
 */

package javafundamentals.statements;

public class CodingExercises2 {

    static void evenNumbers(int j) {
        while (j <= 100) {
            System.out.printf("%d, ", j);
            j += 2;
        }
    }

    public static void main(String[] args) {
        System.out.println();
        int j = 2;
        evenNumbers(j);
        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        for (int i = 2; i <= 100; i += 2) {
            System.out.printf("%d, ", i);
        }
        System.out.println();
    }
}
