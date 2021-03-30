package javafundamentals.swap;

/**  Write a Java program that swaps two instance variables a = 15; b = 25; */

public class Swap2 {

    int a = 15;
    int b = 25;

    public static void main(String[] args) {

        Swap2 swap = new Swap2();

        int x;
        x = swap.a;
        swap.a = swap.b;
        swap.b = x;

        System.out.println("a = " + swap.a + " and b = " + swap.b);
    }
}
