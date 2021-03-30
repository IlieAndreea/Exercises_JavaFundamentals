/** Write a method that receives 2 integer parameters and check if the first int contains the second int.
 * The method will return a boolean.
 * Example: returns true for 123 and 1. */

package javafundamentals.statements;

public class CodingAdditional1 {

    private static void checkMethod (int a, int b) {
        String x = Integer.toString(a);
        String y = Integer.toString(b);

        for (int i = 0; i < x.length(); i++){
            for (int j = 0; j < y.length(); j++) {
                if (y.charAt(j) == x.charAt(i)) {
                    System.out.println(true);
                }
            }
        }
    }

    public static void main(String[] args) {
        checkMethod(123, 1);
    }
}
