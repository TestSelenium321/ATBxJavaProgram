package Dec.exe_12_Program1;

public class TriangleClassifier {
 /*Write a program that classifies a triangle based on its side lengths.
 Given three input values representing the lengths of the sides,
 determine if the triangle is equilateral (all sides are equal),
  isosceles (exactly two sides are equal), or scalene (no sides are equal).
  Use an if-else statement to classify the triangle.*/

    public static void main (String [] args) {
        int side1 =  2; //Replace with the lengths of your triangle's
        int side2 =  5;
        int side3 =  8;

        if (side1==side2 && side2==side3){
            System.out.println("equilateral Triabgle");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("isosceles triangle");
        }
        else {
            System.out.println("scalene triangle");
        }

    }

}
