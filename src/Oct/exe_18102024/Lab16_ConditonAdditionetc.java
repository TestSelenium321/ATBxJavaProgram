package Oct.exe_18102024;
import java.util.Scanner;

public class Lab16_ConditonAdditionetc {

    public static void main(String[] args) {

        //Write a program to Menu driven program using switch statement
        // ( Find addition, subtraction, multiplication and division of to integer numbers )
        int Num1;
        int Num2;
        Scanner scanner = new Scanner (System.in);
        System.out.printf("Enter the first number: ");
        Num1 = scanner.nextInt();
        System.out.printf("Enter the first number: ");
        Num2= scanner.nextInt();
        System.out.printf("Enter the Arithmatic operation: ");
        char operation = scanner.next().charAt(0);

        switch (operation){
            case '+':
                int result1 = (Num1+Num2);
                System.out.println("Addition of 2 number is: " + result1);
                break;
            case '*':
                int result2 = (Num1*Num2);
                System.out.println("Multiplication of 2 number is: " + result2);
                break;
            case '-':
                int result3 = (Num1-Num2);
                System.out.println("Subtraction of 2 number is: " + result3);
                break;
            case '/':
                int result4 = (Num1/Num2);
                System.out.println("Division of 2 number is: " + result4);
                break;
            case '%':
                int result5 = (Num1%Num2);
                System.out.println("Modulos of 2 number is: " + result5);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
scanner.close();
    }
}
