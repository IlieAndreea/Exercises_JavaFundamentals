/** Print values: 192, 168, 1, 10 in HEX format XX:XX:XX:XX.
    Use System.out.printf() method.
    Input: 192, 168, 1, 10
    Output: „C0:A8:01:0A”*/

package javafundamentals.datatypesandvariables;

public class JFpdf1Variables4 {

    public static void main(String[] args) {
        int x = 192;
        int y = 168;
        int z = 1;
        int a = 10;

        System.out.printf("„%X:%X:0%X:0%X\"\n\n", x, y, z, a);

        System.out.printf("%x\n", x);
        System.out.printf("%x\n", y);
        System.out.printf("%x\n", z);
        System.out.printf("%x\n", a);
    }
}
