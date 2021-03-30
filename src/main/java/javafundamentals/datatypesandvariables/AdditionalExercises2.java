/**2. Implement the program, where you will declare and initialize several final
variables of various types having any names. Next, try to display them in the following
 lines of text. Compile it and check what will happen, when you try to set the value again
 for any previously declared final variable.*/

package javafundamentals.datatypesandvariables;

public class AdditionalExercises2 {
    public static void main(String[] args) {

        final int finalInt = 574;
        final String finalString = "Test String";
        final boolean finalBoolean = true;
        final long finalLong = 874532L;
        final float finalFloat = 5.5f;
        final char finalChar = '&';

        System.out.println(finalInt);
        System.out.println(finalString);
        System.out.println(finalBoolean);
        System.out.println(finalLong);
        System.out.println(finalFloat);
        System.out.println(finalChar);

//        finalBoolean = false;
//        finalFloat = 8.7f;
    }
}
