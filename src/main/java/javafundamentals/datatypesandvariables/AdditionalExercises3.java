/**Display on the screen in the following lines the values of the logical expressions listed
 below:
 */

package javafundamentals.datatypesandvariables;

public class AdditionalExercises3 {

        public static void main(String[] args) {

            System.out.println(2 * 2 >= 3 && 1 == 1);
            System.out.println(12/4 != 3);
            System.out.println(12%4 != 0);
            System.out.println(3 != 4 || (2 + 3 > 5));
            System.out.print("\n");

            int x = 4;
            System.out.println(x++);
            System.out.println(--x);
            System.out.println(x % 3);
            System.out.println(11 % 2);
            System.out.println(7 % x++);
            System.out.println(x == 4);
            System.out.println(x != 4);
            x = 10;
            int y = 5;
            System.out.println(x == 10 && y <= 5);
            System.out.println(x <= y && y > 5);
            System.out.println("abc" instanceof String);
        }
    }

