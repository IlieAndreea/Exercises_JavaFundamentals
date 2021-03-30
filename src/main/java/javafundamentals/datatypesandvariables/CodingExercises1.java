/** 1. Write a Java program to print the sum of two numbers: 74 + 36 = 110
    2. Write a Java program to divide two numbers and print on the screen: 50 / 3 = 16 remainder 2
    3. Enter two values of type int. Display their division casted to the double type and rounded to  the third decimal point.
  */

package javafundamentals.datatypesandvariables;

public class CodingExercises1 {

    public static void main(String[] args) {

        int a = 74;
        int b = 36;
        int sum2 = a + b;

        System.out.println("1. The sum with println: " + a + " + " + b + " = " + sum2);
        System.out.printf("1. Te sum with printf: %d + %d = %d", a, b, sum2);

        int x = 50;
        int y = 3;
        int divisionResult = x / y;
        int remainderOfDivisionResult = x % y;
        System.out.println("\n\n2. " + x + " / " + y + " = " + divisionResult + " remainder " + remainderOfDivisionResult);

        int m = 550;
        int n = 3;
        double division = (double) m / n;
        double roundDiv = Math.round(division * 1000.00) / 1000.00;
        System.out.println("\n3. The division of " + m + " by " + n
                            + " casted to the double type and rounded to the third decimal point is: " + roundDiv);

    }
}
