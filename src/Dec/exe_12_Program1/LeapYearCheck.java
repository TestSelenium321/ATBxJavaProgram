package Dec.exe_12_Program1;

import java.util.Scanner;
/*Create a program that determines whether a given year is a leap year.
A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
Use an if-else statement to make this determination*/

public class LeapYearCheck {
    public static void main (String [] args) {
        //enter user to create scanner object
        Scanner scanner = new Scanner(System.in);

        //Promt the user to enter the leap year
        System.out.println("Enter the year to check if the year is a leap year: ");
        // Read the user input and store it in a int variable
       int year = scanner.nextInt();

        //or we can use this

        // int year = 2024;

        // Use an if-else statement to determine if it's a leap year

        if ((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)){
            System.out.println("Year is a leap year: " + year);
        }
        else {
            System.out.println("Year is not a leap year: " + year);
        }

        //scanner.close();

    }
    }

