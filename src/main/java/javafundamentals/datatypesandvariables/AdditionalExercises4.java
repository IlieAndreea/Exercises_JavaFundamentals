/** 4. Implement a program, where you have to:
 a) Declare and initialize two variables: intVar1, intVar2 of int type
 b) Declare variable shortSum of short type and initialize it as the sum of previously
 declared variables (intVar1 + intVar2)
 c) Display on the screen the value stored in shortSum variable
 d) Next, display on the screen the result of the incrementation: shortSum++
 e) Declare variable byteSum of byte type and initialize it as the sum of previously
 declared variables (intVar1 + intVar2)
 f) Display on the screen the value stored in byteSum variable
 g) Next, display on the screen the result of the incrementation: ++byteSum
 h) Declare variable doubleSum of double type and initialize it as the sum of previously declared variables (intVar1 + intVar2)
 i) Display on the screen the value stored in doubleSum variable
 j) Next, display on the screen the result of the incrementation: doubleSum++
 k) Declare variable floatSum of float type and initialize it as the sum of previously
 declared variables (intVar1 + intVar2)
 l) Display on the screen the value stored in floatSum variable
 m) Next, display on the screen the result of the incrementation: ++ floatSum
 */
package javafundamentals.datatypesandvariables;

public class AdditionalExercises4 {
    public static void main(String[] args) {

        int intVar1 = 10;
//        short shortVar1 = (short)intVar1;
        int intVar2 = 4;
//        short shortVar2 = (short)intVar2;

        short shortSum = (short)(intVar1 + intVar2);
        byte byteSum = (byte)(intVar1 + intVar2);
        double doubleSum = intVar1 + intVar2;
        float floatSum = intVar1 + intVar2;

        System.out.println("c) The shortSum is = " + shortSum++ + "  (Narrowing Casting/manually)");
        System.out.println("d) The incrementation of shortSum++ is: " + shortSum);
        System.out.println("f) The byteSum is = " + byteSum + "  (Narrowing Casting/manually)");
        System.out.println("g) The incrementation of ++byteSum is: " + ++byteSum);
        System.out.println("i) The doubleSum is: " + doubleSum++ + "   (Widening Casting/automatically)");
        System.out.println("j) The incrementation of doubleSum++ is: " + doubleSum);
        System.out.println("l) The floatSum is: " + floatSum + "   (Widening Casting/automatically)");
        System.out.println("m) The incrementation of ++floatSum is: " + ++floatSum);
    }
}
