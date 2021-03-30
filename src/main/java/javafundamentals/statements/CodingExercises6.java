/** Write a Java program to print Fibonacci series of n terms. (ex.: 10)  (2 methods)
    Output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 */

package javafundamentals.statements;

public class CodingExercises6 {

    public static void main(String[] args) {

        System.out.println("Method 1:");
        int number = 10;
        int a = 0;
        int b = 1;
        int aux = 0;
        int counter = 0;

        while (counter < number) {
            System.out.print(a + ", ");
            aux = b;
            b = a + b;
            a = aux;
            counter++;
        }
        System.out.println();

        System.out.println("Method 2 (recursive):");
            recursiveFibonacci(10);
            System.out.print(recursiveFibonacci(0) + ", ");
            System.out.print(recursiveFibonacci(1) + ", ");
            System.out.print(recursiveFibonacci(2) + ", ");
            System.out.print(recursiveFibonacci(3) + ", ");
            System.out.print(recursiveFibonacci(4) + ", ");
            System.out.print(recursiveFibonacci(5) + ", ");
            System.out.print(recursiveFibonacci(6) + ", ");
            System.out.print(recursiveFibonacci(7) + ", ");
            System.out.print(recursiveFibonacci(8) + ", ");
            System.out.print(recursiveFibonacci(9));
        }

        private static int recursiveFibonacci ( int number){
            if (number == 1 || number == 0) {
                return number;
            } else {
                return recursiveFibonacci(number - 1) + recursiveFibonacci(number - 2);
            }
        }
}
