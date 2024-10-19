package Oct.exe_18102024;

import java.util.Scanner;

public class Lab07_Monthswitchcase {

    public static void main(String[] args){

        //Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
        // Input  - 12
        // Out - Dec.
        System.out.println("Print the month name correspond to the number from 1 to 12");
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the corresponding month number");
        int month = scanner.nextInt();

       switch (month){
           case 1:
               String Jan = "January";
               System.out.println("The month is: " + Jan );
               break;
           case 2:
               String Feb = "February";
               System.out.println("The month is: " + Feb );
               break;
           case 3:
               String Mar = "March";
               System.out.println("The month is: " + Mar );
               break;
           case 4:
               String Apr = "April";
               System.out.println("The month is: " + Apr );
               break;
           case 5:
               String May = "May";
               System.out.println("The month is: " + May );
               break;
           case 6:
               String Jun = "june";
               System.out.println("The month is: " + Jun );
               break;
           case 7:
               String Jul = "july";
               System.out.println("The month is: " + Jul );
               break;
           case 8:
               String Aug = "August";
               System.out.println("The month is: " + Aug );
               break;
           case 9:
               String Sep = "September";
               System.out.println("The month is: " + Sep );
               break;
           case 10:
               String Oct = "October";
               System.out.println("The month is: " + Oct );
               break;
           case 11:
               String Nov = "Novemeber";
               System.out.println("The month is: " + Nov );
               break;
           case 12:
               String Dec = "December";
               System.out.println("The month is: " + Dec );
               break;
           default:
               System.out.println("Invalid number, Please enter valid number");
       }

       scanner.close();




    }



}
