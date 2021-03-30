package javafundamentals.statements;

public class JFpdf2Statements2 {
    public static void main(String[] args) {
        // switch statement examples
        int grade = 10;

        switch(grade) {
            case 10:
                System.out.println("Super Star!");
                break;
            case 9:
                System.out.println("You're cool!");
                break;
            case 8:
                System.out.println("That's good!");
                break;
            case 7:
                System.out.println("Hm, Not bad!");
                break;
            case 6:
                System.out.println("You need more practice!");
                break;
            case 5:
                System.out.println("You passed!");
                break;
            case 4:
                System.out.println("You failed!");
                break;
            default:
                System.out.println("Invalid grade! Enter a valid grade!");
        }
    }
}
