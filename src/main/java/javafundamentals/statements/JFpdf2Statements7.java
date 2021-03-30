/** Write a Java program to find if a year is a leap year or not. */

package javafundamentals.statements;

public class JFpdf2Statements7 {
    public static void main(String[] args) {
        int year = 2020;

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Year " + year + " is a leap year!");
        } else System.out.println("Year " + year + " is not a leap year!");
    }
}
