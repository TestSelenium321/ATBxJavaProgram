package Oct.exe_18102024;

import java.util.Scanner;
public class Lab13_ExerciseEvenOdd_Switch {
    public static void main(String[] args) {
        //Write a program to Check whether the number is even or odd using switch statement

            Scanner scanner = new Scanner(System.in);
            System.out.printf("Enter the number: ");
            int num = scanner.nextInt();
            int result = (num%2);
            //We use a switch statement to check if the remainder of num divided by 2 is 0 or 1.
             //If the remainder is 0, we print "This is a Even Number".
            //If the remainder is 1, we print "This is a Odd Number".
            switch (result)
            {
                case 0:
                    System.out.println("Number is Even");
                    break;
                case 1:
                    System.out.println("Number is Odd");
                    break;
               default:
               System.out.println("Enter valid number");
            }
scanner.close();
    }
}
