/**Read any double literal from the console. Print that value rounded to the second
 decimal place.*/

package javafundamentals.datatypesandvariables;

import java.util.Scanner;

public class JFpdf1Variables3 {

    public static void main(String[] args) {

        double literal = 4563.58765;
        double roundDecimal2 = Math.round(literal * 100.0)/100.0;
        double roundDecimal3 = Math.round(literal * 1000.0)/1000.0;
        int roundMeth = (int)Math.round(literal);
        int roundCeil = (int)Math.ceil(literal);
        int roundFloor = (int)Math.floor(literal);
        double roundRint = Math.rint(literal);

        System.out.println("1. The double literal value rounded to the second decimal place: " + roundDecimal2 +
                           " and to the third decimal place: " + roundDecimal3);
        System.out.println("2. The round method of a double type to an int type: " + roundMeth);
        System.out.println("3. The roundCeil method: " + roundCeil);
        System.out.println("4. The roundFloor method: " + roundFloor);
        System.out.println("5. The roundRint method: " + roundRint);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter a number of type double!");
        double dValue = scanner.nextDouble();
        double roundDValue = Math.round(dValue * 100.0) / 100.0;
        System.out.println("The value rounded to the second decimal place is: \n" + roundDValue);

        System.out.println("\nPlease add two values of type int!");
        System.out.println("Write first value: ");
        int firstValue = scanner.nextInt();
        System.out.println("Write second value: ");
        int secondValue = scanner.nextInt();
        System.out.println("Sum of your values is:\n " + (firstValue + secondValue));
    }
}
