/** Write an application that for any entered number between 0 and 9 will provide it’s name.
    For example for “3” program should print “three”. */

package javafundamentals.statements;

public class CodingAdditional4 {
    public static void main(String[] args) {
        int number = 8;

        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
            System.out.println("one");
                break;
            case 2:
            System.out.println("two");
                break;
            case 3:
            System.out.println("three");
                break;
            case 4:
            System.out.println("four");
                break;
            case 5:
            System.out.println("five");
                break;
            case 6:
            System.out.println("six");
                break;
            case 7:
            System.out.println("seven");
                break;
            case 8:
            System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
        }
    }
}
