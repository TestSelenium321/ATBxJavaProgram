package Oct.exe_16102024;

import java.util.Scanner;

public class Lab03_Scanner_Maxofnumber {
    public static void main(String[] args) {

        //Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.println("The values are: " + "a" + "=" + a + "," + "b" + "=" + b);
        System.out.println("To find maximum of 2 number using Ternary operator");
        System.out.println(a>b ? "a is Larger" : "b is larger");

        scanner.close();

    }
}
