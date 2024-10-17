package Oct.exe_17102024;

import java.util.Scanner;

public class Lab09_Task17_02 {
    public static void main(String[] args) {
      /*  ✅ Triangle Classifier:

    Write a program that classifies a triangle based on its side lengths.
    Given three input values representing the lengths of the sides,
    determine if the triangle is
    equilateral (all sides are equal),
    isosceles (exactly two sides are equal), or
    scalene (no sides are equal).
    Use an if-else statement to classify the triangle.
    side1, side2, side2 → eq, iso, scalene*/

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the length of the side1: ");
    int side1 = scanner.nextInt();

    System.out.println("Enter the lenght of side2; ");
    int side2 = scanner.nextInt();

    System.out.println("Enter the lenght of side3: ");
    int side3 = scanner.nextInt();

    if (side1==side2 && side2==side3){
        System.out.println("This is equilateral triabgle as all sides are equal");
    }
    else if (side1==side2 || side2==side3){
        System.out.println("This is isosceles triabgle as exactly two sides are equal");
    }
    else {
        System.out.println("This is a Scalene triabgle as no sides are equal");
    }
scanner.close();

    }
}
