package Oct.exe_17102024;

import java.util.Scanner;

public class Lab06_OddEven_Program {
    public static void main(String[] args) {
        // Create a Program - Take user input
        // Check weather the input is even or odd number - For this we need to use modulo % to check
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check Even or Odd");
        int num = scanner.nextInt();
        //int num =5; if we are not using user input we can declare the num value, 5%2 ==0
        // Modulus -> %
        //   10%2 == Even -> 0
        //   10%2 == Odd -> 1
        if (num % 2==0){
            System.out.println(num + " " + "Number is Even");
        }
        else{
        System.out.println(num + " " + "Number is Odd");
        }
        scanner.close();
    }
}
