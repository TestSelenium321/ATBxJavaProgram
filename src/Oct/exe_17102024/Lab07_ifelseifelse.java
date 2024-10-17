package Oct.exe_17102024;

import java.util.Scanner;
public class Lab07_ifelseifelse {
    public static void main(String[] args) {
        // Condition - using user input scanner class, check 2 condition using if else if else

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        //condition
        if (num1>num2){
            System.out.println("result: " + "true");
        }
        else if(num2>num1) {
            System.out.println("result: " + "false");
        }
        else {
            System.out.println("both are equal");
        }
        scanner.close();
        }

      }


