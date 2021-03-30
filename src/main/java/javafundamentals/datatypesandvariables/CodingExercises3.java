/** Write a Java program that takes three numbers as input to calculate and print the average of the numbers: 10, 20, 30
    Output: Average = 20 */

package javafundamentals.datatypesandvariables;

import java.util.Scanner;

public class CodingExercises3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers of int type!");
        System.out.println("The first number is: ");
        int firstNumber = scanner.nextInt();
        System.out.println("The second number is: ");
        int secondNumber = scanner.nextInt();
        System.out.println("The third number is: ");
        int thirdNumber = scanner.nextInt();
        double average = (firstNumber + secondNumber + thirdNumber) / (double)3;
        double round = Math.round(average * 100.00) / 100.00;
        System.out.println("Average = " + round);
    }
}
