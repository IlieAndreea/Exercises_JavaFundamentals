/**Write a program that prints the first n prime numbers: n = 4
   Output: 2, 3, 5, 7
 */

package javafundamentals.statements;

public class CodingExercises8 {

    public static void main(String[] args) {
        int ct = 0;
        int n = 0;
        int i = 1;
        int j = 1;


        while (n < 7) {
            j = 1;
            ct = 0;
            while (j <= i) {
                if ( i % j == 0)
                    ct++;
                j++;
            }
            if (ct == 2) {
                System.out.printf("%d ",i);
                n++;
            }
            i++;
        }
    }
}
