/** Write a Java program that accepts an integer (ex.: n = 5) and displays n, nn, nnn, nnnn, nnnnnn.
    Output: 5, 55, 555, 5555, 55555
 //5 * 10 + 5 = 55
 //55 * 10 + 5 = 555
 // 555 * 10 +5 = 5555
 */

package javafundamentals.statements;

import java.util.Scanner;

public class CodingExercises3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number in the range of 1 - 9!");
        int n = scanner.nextInt();
        int i = 1;
        final int nFinal = n;

        do {
            System.out.print(n + ", ");
            n = n * 10 + nFinal;
            i++;
        } while (i <= nFinal);
    }
}
