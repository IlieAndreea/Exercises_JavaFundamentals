package javafundamentals.statements;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        double number = 45.65431;
//        double newNumber = Math.round(number * 1000.0) / 1000.0;
//        System.out.println(newNumber);

//        int a = 54;
//        int b = 7;
//        double division = a / (double) b;
//        double roundDiv = Math.round(division * 1000.00) / 1000.00;
//        System.out.println(division);

//        short x = Short.MAX_VALUE;
//        short y = 1;
//        int z = x + y;
//        long mod = z % (Short.MAX_VALUE+1);
//        System.out.println(mod);
//        System.out.println(z);
//        System.out.println();
//        System.out.println(Integer.MAX_VALUE);

//        Scanner scanner = new Scanner(System.in);
//        String cValue = scanner.nextLine();
//        char ch = scanner.next().charAt(1);
//        float fValue = scanner.nextFloat();
//        byte bValue = scanner.nextByte();

        // This logic will generate the triangle for given dimension
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                System.out.print("2");
            }
            for (int j = 0; j <= i; j++) {
//                if (i != n - 1)                     //uncomment lines 39 - 44 to display only outer line.
//                  if (j == 0 || j == i)
//                      System.out.print("*");
//                  else
//                      System.out.print(" ");
//                else
                System.out.print("3");
//                System.out.print(" ");
            }
            for (int l = 1; l < i + 1; l++) {
                System.out.print("4");
            }
            System.out.println();
        }
    }
}

