/** 1. Write a Java program to print the area and perimeter of a circle: radius = 7.5
       Output: Area = 176.71458676442586; Perimeter = 47.12388980384689
    2. Write a Java program to print the area and perimeter of a rectangle: Width = 5.5; Height = 8.5
       Output: Area = 47.60; Perimeter = 28.20*/

package javafundamentals.datatypesandvariables;

public class CodingExercises2 {

    public static void main(String[] args) {

        double radius = 7.5;
        double areaC = Math.PI * radius * radius;
        double perimeterC = 2 * Math.PI * radius;

        System.out.println("1. Area = " + areaC + "; Perimeter = " + perimeterC);

        float width = 5.5f;
        float height = 8.5f;
        float areaR = width * height;
        float perimeterR = 2 * (width + height);

        System.out.println("2. Area = " + areaR + "; Perimeter = " + perimeterR);
    }
}
