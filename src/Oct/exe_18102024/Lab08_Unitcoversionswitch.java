package Oct.exe_18102024;

import java.util.Scanner;

public class Lab08_Unitcoversionswitch {
    public static void main(String[] args) {

        // Write a program that converts between different units
        // (e.g., kilometers to miles, Celsius to Fahrenheit)
        // based on user selection using a switch statement.
         // Input. - choice - 1 - km → m
        //            choice - 2 - f → c
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unit conversion");
        int units = scanner.nextInt();
        double meters = scanner.nextDouble();
        double convertedValue;
         switch (units) {

             case 1:
                 convertedValue = meters / 1000;
                 System.out.printf("%.2f meters is %.2f kilometers.%n", meters, convertedValue);
                 break;
         }
scanner.close();


    }

}
