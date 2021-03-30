/**1. Implement a program, where:
        a) Declare and initialize three variables of type int : a, b, c (initialize it to any values)
        b) Store the result of the a - b - c operation in the variable result1 and then display
        it on the standard output (screen)
        c) Declare and initialize three variables of type long : d, e, f (initialize it to any
        values)
        d) Store the result of the d * e / f operation in the variable result2 a
        nd then display it
        on the standard output (screen) */

package javafundamentals.datatypesandvariables;

public class AdditionalExercises1 {
    public static void main(String[] args) {

        int a = 35;
        int b = 10;
        int c = 15;
        int result1 = a - b - c;

        System.out.println("a - b - c = " + result1);

        long d = 522L;
        long e = 312L;
        long f = 6;
        long result2 = d * e / f;

        int x = 10;
        double y = 10.165312;
        double z = x + y;

        System.out.printf("d * e / f = " + "%d\n", result2);
        System.out.println(z);
    }
}
