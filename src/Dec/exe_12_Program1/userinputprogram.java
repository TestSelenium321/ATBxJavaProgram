package Dec.exe_12_Program1;

import java.util.Scanner;

public class userinputprogram {

    //Program : How to Take Input from Users?

    public static void main(String[] args) {
        //Create a scanner object to read the user input
        Scanner scanner = new Scanner(System.in);
        //Prompt the user to enter the name
        System.out.println("Enter your name: ");
        //Read the user input  and store it in a string variable
        String name = scanner.nextLine();
        //Prompt the user to enter the age
        System.out.println("Enter your age: ");
       // Read the user integer input and store it in a int variable
       int age = scanner.nextInt();
       //Prompt the user to enter the salary
        System.out.println("Enter the salary: ");
        //Read the double input and store it in a double variable
       double salary = scanner.nextDouble();
        // Display the user's input
        System.out.println("Hello, " + name + "! Your age is " + age + " and " +  " Your salary is " + salary + " .");

       //close the scanner object to release resources
        scanner.close();

    }

    }
