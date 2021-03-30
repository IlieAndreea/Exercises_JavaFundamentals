/** The Fizz Buzz Problem: Write a program which prints "fizz" if the number is a multiplier of 3, prints "buzz" if
 * it's a multiplier of 5 and prints "fizzbuzz" if the number is divisible by both 3 and 5. */

package javafundamentals.statements;

import java.util.Scanner;

public class JFpdf2Statements8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
//        int a = 13;

        if (a == 0 || (a % 3 != 0 && a %5 != 0)) {
            System.out.println("Please enter a number different from 0 and multiple of 3 or 5!");
        } else if (a % 3 == 0 && a %5 == 0) {
            System.out.println("fizzbuzz");
        } else if (a % 5 == 0) {
            System.out.println("buzz");
        } else if (a % 3 == 0) {
            System.out.println("fizz");
        }
    }
}
