package javafundamentals.swap;

/** Write a Java program that swaps:
 * two class variable m = 40 and n = 50;
 * two instance variables a = 15 b = 25;
 * also create a swap() that swaps two local variables x = 10 y = 15 and call it in main();
 */
public class Swaps {

    static int m = 40;
    static int n = 50;
    int a = 15;
    int b = 25;

    static void swap(int x, int y) {
        int z = x;
        x = y;
        y = z;
        System.out.println("x = " + x + " and y = " + y);
    }

    public static void main(String[] args) {

        int l = m;
        m = n;
        n = l;
        System.out.println("m = " + m + " and n = " +n);

        Swap2 swap = new Swap2();
        int c;
        c = swap.a;
        swap.a = swap.b;
        swap.b = c;
        System.out.println("a = " + swap.a + " and b = " + swap.b);

        swap(10,15);
    }
}
