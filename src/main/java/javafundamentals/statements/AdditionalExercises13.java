/** Implement the program computing the sum of factors from the arithmetic sequence.
    a.) The first factor value of the sequence is equal to 5, the difference of each subsequent factor  is equal to 2.
       We want to sum 459 elements (use ‘for’ loop).
    b.) The first factor value of the sequence is equal to 5, the difference of each subsequent factor  is equal to 3.
        We want to sum 125 elements (use ‘for’ loop).
    c.) The first factor value of the sequence is equal to 3, the difference of each subsequent factor  is equal to 2.
        We want to sum 632 elements (use ‘for’ loop).
 */

package javafundamentals.statements;

public class AdditionalExercises13 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 5; i <= 458 * 2 + 5; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("a.) Sum = " + sum);

        int sumb = 0;
        for (int i = 5; i <= 125 * 3 + 5; i = i + 3) {
            sumb += i;
        }
        System.out.println("b.) Sum = " + sumb);

        int sumc = 0;
        for (int i = 3; i <= 632 * 2 + 3; i = i +2) {
            sumc += i;
        }
        System.out.println("c.) Sum = " + sumc);

//        int sum = 0;
//        for (int i = 5; i <= 460 * 2 + 1; i = i + 2) {
//            sum = sum + i;
//        }
//        System.out.println("Sum = " + sum);

    }
}
