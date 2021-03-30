package javafundamentals.datatypesandvariables;

/** Define (declare and initialize) two variables: one of type „int” and second of type „double”. Print
 * 1. their values,
 * 2. the sum,
 * 3. the max and the min,
 * 4. the average,
 * 5. the odd and even variables (of 2 new declared int variables)*/

public class JFpdf1Variables1 {

    public static int sumOfTwoVariables(int x, int y) {
        int z = x + y;
        System.out.println("\n6. The sum of the sumOfTwoVariables method is : " + z);
        return z;
    }

    public static void main(String[] args) {
        int intVariable = 19;
        double doubleVariable = 187.2342;
        double sum = intVariable + doubleVariable;

        System.out.println("\n1. Value of int variable= " + intVariable + "; Value of double variable= " + doubleVariable);

        System.out.printf("\n2. The sum is: %f\n", sum);

        if(intVariable < doubleVariable) {
            System.out.println("\n3. The maximum is: " + doubleVariable + "\n" + "   " + "The minimum is: " + intVariable);
        } else if(intVariable > doubleVariable) {
            System.out.println("\n3. The maximum is: " + intVariable + "\n" + "   " + "The minimum is: " + doubleVariable);
        } else System.out.print("\n3. The variables are equal!\n");

        double average = (intVariable + doubleVariable) / 2;
        System.out.printf("\n4. The average is: %f\n", average);

        int a = 5;
        int b = 10;

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("\n5. a= " + a + "and b= " + b + " are both even");
        } else if (a % 2 == 1 && b % 2 == 1) {
            System.out.println("\n5. a= " + a + "and b= " + b + " are both odd");
        } else if (a % 2 == 0 || b % 2 == 1) {
            System.out.println("\n5. a= " + a + " is even and b= " + b + " is odd");
        } else System.out.println("\n5. a= " + a + " is odd and b= " + b + " is even");

        sumOfTwoVariables(5, 89);
    }
}
