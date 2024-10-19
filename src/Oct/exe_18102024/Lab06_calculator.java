package Oct.exe_18102024;

import java.util.Scanner;

public class Lab06_calculator {
    public static void main(String[] args) {
        //Create a simple calculator that performs addition, subtraction,
        // multiplication, and division, modus based on user input using switch statements.
        // Inputs :   num 1, num 2, +
          // Output :  num1+num2 → print information.
       //Scanner scanner = new Scanner(System.in);
       //System.out.println("Enter the calculator operation");
       //int cal = scanner.nextInt();

        System.out.println("Program for simple calculator based on user input and switch case");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the first number");
        int Num1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the second number");
        int Num2 = scanner2.nextInt();

        Scanner scanner3 = new Scanner (System.in);
        System.out.println("Enter the Arithmetic operator");
        char operator = scanner3.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Addition");
                break;
            case '-':
                System.out.println("Subtraction");
                break;
            case '*':
                System.out.println("Multiplication");
                break;
            case '/':
                System.out.println("Division");
                break;
            case '%':
                System.out.println("Modulous");
                break;
            default:
                System.out.println("invalid");
                break;
        }
       /* scanner1.close();
        scanner2.close();
        scanner3.close();*/

          }


}
