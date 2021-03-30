/** Write an application that will show if entered value is greater, equal or lower than 30. */

package javafundamentals.statements;

import java.util.Scanner;

public class CodingAdditional2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value!");
        double enteredValue = scanner.nextDouble();

        if (enteredValue == 30) {
            System.out.println("Your value is equal to 30!");
        } else if (enteredValue > 30) {
            System.out.println("Your value is greater than 30!");
        } else System.out.println("Your value is lower than 30!");
    }
}
