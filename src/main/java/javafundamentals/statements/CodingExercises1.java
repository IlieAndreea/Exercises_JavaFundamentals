/** Write a Java program that takes a number (ex.: 8) and prints its multiplication table up to 10.
    Output: 8, 16, 24, 32, ..., 80
 */

package javafundamentals.statements;

import java.util.Scanner;

public class CodingExercises1 {

    static void multiplicationMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in an integer number in the range of 0 - 10!");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multiplication = i * number;
            System.out.print(multiplication + ", ");
        }

    }

    public static void main(String[] args) {
        multiplicationMethod();
    }
}
