/** Write a Java program to compute the sum of the digits of an integer: 133; 258; 7491 (in 3 different methods)
    Output: 7; 15; 21 */

package javafundamentals.datatypesandvariables;

public class CodingExercises5 {

    static void sumOfDigits2(int number2) {
        int digitSum2 = 0;

        while (number2 > 0) {
            int lastDigit2 = number2 % 10;
            digitSum2 += lastDigit2;
            number2 = number2 / 10;
        }
        System.out.println("Second digit sum is: " + digitSum2);
    }

    static int sumOfDigits1(int number1) {
        int digitSum1 = 0;

        while(number1 > 0) {
            int lastDigit1 = number1 % 10;
            digitSum1 += lastDigit1;
            number1 = number1 / 10;
        }
        return digitSum1;
    }

    public static void main(String[] args) {
        int number1 = 133;
        System.out.printf("\nFirst digit sum is: %d\n", sumOfDigits1(number1));

        sumOfDigits2(258);

        int number3 = 7491;
        int digitSum3 = 0;

        while (number3 > 0) {
            int lastDigit3 = number3 % 10;
            digitSum3 += lastDigit3;
            number3 = number3/10;
        }
        System.out.println("Third digit sum is: " + digitSum3);
    }
}
