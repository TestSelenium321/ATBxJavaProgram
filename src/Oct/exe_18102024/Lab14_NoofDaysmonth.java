package Oct.exe_18102024;

import java.util.Scanner;
public class Lab14_NoofDaysmonth {
    public static void main(String[] args) {

        //Write a program to Find the number of days in a month using a switch statement
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the month number: ");
        int month = scanner.nextInt();
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("No of days is 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("No of days is 30");
                break;
            case 2:
                System.out.println("No of days is 28");
                break;
            default:
                System.out.println("invalid number");

        }
        scanner.close();
    }
}

