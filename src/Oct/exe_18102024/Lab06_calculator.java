package Oct.exe_18102024;

import java.util.Scanner;

public class Lab06_calculator {
    public static void main(String[] args) {
        //Create a simple calculator that performs addition, subtraction,
        // multiplication, and division, modus based on user input using switch statements.
        // Inputs :   num 1, num 2, +
          // Output :  num1+num2 → print information.


        //int Num1;
       // int Num2;
        System.out.println("Program for simple calculator based on user input and switch case");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int Num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int Num2 = scanner.nextInt();

        System.out.println("Enter the Arithmetic operator");
        char operator = scanner.next().charAt(0);
        //next().charAt(0) to take character type input from keyboard.


        switch (operator) {
            case '+':
                int addition = Num1+Num2;
                System.out.println("The result is addition: " + addition);
               // OR ..System.out.println("The result is addition: " + "=" + (Num1+Num2));
               break;
            case '-':
                int Subtraction = Num1-Num2;
                System.out.println("The result is subtraction: " + "=" + (Num1-Num2));
               break;
            case '*':
                int Multiplication = Num1*Num2;
                System.out.println("The result is multiplication: " + "=" + (Num1*Num2));
                break;
            case '/':
                int Division = Num1/Num2;
                System.out.println("The result is division: " + "=" + (Num1/Num2));
                break;
            case '%':
                int Modulous = Num1%Num2;
                System.out.println("The result is Modulous: " + "=" + (Num1%Num2));
               break;
            default:
                System.out.println("invalid, Please enter valid operator");
               break;
        }
        scanner.close();

          }

}
