/**  Define variable of type int. What is a maximum and minimum value, that you are able
 to store within that variable?
     Do the same as above for other numeric types (long, double, byte..).
     Define the int type variable with maximum value. Add 1 to it. What do you think will
 happen? */

package javafundamentals.datatypesandvariables;

public class JFpdf1Variables2 {

    public static void main(String[] args) {

        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        int maximumInt = maxInt + 1;
        int minInt = Integer.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;

        System.out.println("1. The MAXIMUM byte value is: " + maxByte);
        System.out.println("1. The minimum byte value is: " + minByte);
        System.out.println("2. The MAXIMUM int value is: " + maxInt);
        System.out.println("2. The minimum int value is: " + minInt);
        System.out.println("3. The MAXIMUM long value is: " + maxLong);
        System.out.println("3. The minimum long value is: " + minLong);
        System.out.println("4. The MAXIMUM double value is: " + maxDouble);
        System.out.println("4. The minimum double value is: " + minDouble);

        System.out.println("\nThe \"Max Int Value + 1\" is: " + maximumInt);
        System.out.println("Since \"" + maxInt + "\" " + "is the maximum int value, adding any strictly positive value " +
                            "to it will cause it to wrap to the next negative number");
    }
}
