/** Write a Java program to compare two numbers and print if they are equal or different,
    smaller, larger, smaller or equal, larger or equal: 25; 39
    Output: 25 != 39
            25 < 39
            25 <= 39 */

package javafundamentals.datatypesandvariables;

public class CodingExercises4 {

    public static void main(String[] args) {

        int number1 = 25;
        int number2 = 25;

        if (number1 == number2) {
            System.out.println("\n" + number1 + " == " + number2);
        } else System.out.println("\n" + number1 + " != " + number2);


        if (number1 < number2) {
            System.out.println(number1 + " < " + number2);
        } else if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        }


        if (number1 == number2) {

        } else if (number1 >= number2) {
            System.out.println(number1 + " >= " + number2);
        } else if (number1 <= number2) {
            System.out.println(number1 + " <= " + number2);
        }
    }
}
