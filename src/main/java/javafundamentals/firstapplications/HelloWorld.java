package javafundamentals.firstapplications;
/** Text modification in print() */

import java.util.Date;

public class HelloWorld {

    public static String world() {

        System.out.println("7. Hello, World!");
        return "7. Hello, World!";
    }

    public static void main(String[] args) {
        String text = "Hello, World!";

        System.out.println("1. " + text);
        System.out.println("2.  Hello,\n\tAndreea!");    //  \n  Insert a newline in the text
        System.out.print("3. Hello,\tAndreea!\n");       //  \t  Insert a tab in the text
        System.out.println("4. \"Hello, m\bAndreea!\"");     //  \b  Insert a backspace

        System.out.printf("5. %S\n", text);             //    %S  Printing a string in uppercase

        Date date = new Date();
        System.out.printf("6. " + "%tc\n", date);              //  %tc  Printing current date and time

        world();
    }
}
