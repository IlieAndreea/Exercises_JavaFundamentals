/**Write a Java program that prints all the powers of a number under 100. (ex.: 3)  (2 methods)
   Output: 3, 9, 27, 81
 */

package javafundamentals.statements;

public class CodingExercises5 {

    public static void main(String[] args) {
        int n = 3;
        final int nFinal = n;

        System.out.println("Method 1:");
        if (n <= 0)
            return;

        do {
            System.out.print(n + ", ");
            n = n * nFinal;
        } while(n <= 100);

        System.out.println();
        System.out.println("\nMethod 2:");
        int number = 3;
        printPowersOfNumber(number);
    }

    private static void printPowersOfNumber(int number) {
        final int nFinal = number;

        if (number <= 0)
            return;

        do {
            System.out.print(number + ", ");
            number = number * nFinal;
        } while(number <= 100);
    }
}
