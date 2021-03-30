/** Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and both. (2 methods)
 Output: Divided by 3: 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69, 72, 75,
 78, 81, 84, 87, 90, 93, 96, 99
 Output: Divided by 5: 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95
 Output: Divided by 3 & 5: 15, 30, 45, 60, 75, 90
 */

package javafundamentals.statements;

public class CodingExercises4 {
    public static void main(String[] args) {

        System.out.println("Method 1:");
        System.out.print("Divided by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println();
        System.out.print("Divided by 5: ");
        for(int i = 1; i <= 100; i++) {
            if(i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println();
        System.out.print("Divided by 3 & 5: ");
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println();
        System.out.println("\nMethod 2:");
        System.out.print("Divided by 3: ");
        extractAndPrintMultipliers(3);
        System.out.println();
        System.out.print("Divided by 5: ");
        extractAndPrintMultipliers(5);
        System.out.println();
        System.out.print("Divided by 15: ");
        extractAndPrintMultipliers(15);
    }

    private static void extractAndPrintMultipliers(int divider) {
        for(int i = 1; i <= 100; i++) {
            if(i % divider == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
