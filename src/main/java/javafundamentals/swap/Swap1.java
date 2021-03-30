package javafundamentals.swap;

/**  Write a Java program that swaps two local variables a = 15; b = 25; */

public class Swap1 {

    public static String swapMethod() {    //written under this form for JUnit
        int a = 15;
        int b = 25;

        int x;
        x = a;
        a = b;
        b = x;

        System.out.println("a = " + a + " and b = " + b);
        return ("a = " + a + " and b = " + b);
    }

    public static void main(String[] args) {
        swapMethod();
    }
}
