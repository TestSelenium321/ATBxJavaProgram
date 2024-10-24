package Oct.exe_23102024;

import java.util.Scanner;
public class Lab06_Task_Function {
    //Create a Function of Sub, Sum, Mul and Div with parameter, a, b
    // (take the parameter from the User)
    //3 → user input
    //4 - user input
    //sum(3,4)

    // Logic Building
    // Step 1 -> Inputs and Outputs
    //  a, b - int -> Scanner
    //  int -> variable result ->

    // Step 2 - Rough logic -> Create functions
    // function -> typr 4th - with return and with arguments/ parameters
    // Step 3 - Write the code and Find and Fix  -> Edge Cases

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number");
        int a = scanner.nextInt();
        System.out.print("Enter the second number");
        int b = scanner.nextInt();

        int result_sum = sum_of_numbers(a, b);
        System.out.println("Sum is: " + result_sum);

        int result_sub = sub_of_number(a, b);
        System.out.println("Sum is: " + result_sub);

        int result_mul = mul_of_number(a, b);
        System.out.println("Sum is: " + result_mul);

        int result_Div = Div_of_number(a, b);
        System.out.println("Sum is: " + result_Div);

        int result_mod =  mod_of_number(a , b);
        System.out.println("Sum is: " + result_mod);

        scanner.close();

    }

    static int sum_of_numbers(int a, int b) {
        return a + b;
    }
    static int sub_of_number (int a, int b) {
        return a - b;
    }
    static int mul_of_number (int a, int b) {
        return a * b;
    }
    static int Div_of_number (int a, int b) {
        return a / b;
    }
    static int mod_of_number (int a , int b) {
        return a % b;
    }

   }

