/** Implement the program displaying all the numbers from the range 1 - 100 which are
 divisible by 5 beginning from 100 (in reverse order). And then also in ascending order. */

package javafundamentals.statements;

public class AdditionalExercises12 {
    public static void main(String[] args) {
        for (int i = 100; i > 0; i = i - 5) {
            System.out.println(i);
        }

        for (int i = 1; i < 101; i ++) {
            if (i % 5 == 0) {
            System.out.println(i);
            }
        }

//        for (int i = 5; i < 101; i = i + 5) {
//            System.out.println(i);
//        }
    }
}
