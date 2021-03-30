/** Compare two values at the same time. Show if both values are greater, equal or lower than 30. Otherwise show "<>".
 Example:
 input: 22, 25 output: lower
 input: 30, 30 output: equal
 input: 32, 33 output: greater
 input: 22, 32 output: <>
 input: 32, 22 output: <>      */

package javafundamentals.statements;

import java.util.Scanner;

public class CodingAdditional3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first value!");
        double input1 = scanner.nextDouble();
        System.out.println("Please enter the second value!");
        double input2 = scanner.nextDouble();

        if (input1 < 30 && input2 < 30) {
            System.out.println("lower");
        } else if (input1 == 30 && input2 == 30) {
            System.out.println("equal");
        } else if (input1 > 30 && input2 > 30) {
            System.out.println("greater");
        } else System.out.println("<>");
    }
}
