package Oct.exe_18102024;
import java.util.Scanner;
public class Lab09_Exercise01 {
    public static void main(String[] args) {
        //Write a program to read a weekday number and print weekday name using switch statement
        //System.out.printf ("Enter the Weekday Number : "); //printf - print is single line
        System.out.println("Enter the Weekday Number : "); //print the value in next line
        Scanner scanner = new Scanner(System.in);
        int daynum = scanner.nextInt();

        switch(daynum){
            case 1:
                System.out.println("It's a Sunday");
                break;
            case 2:
                System.out.println("It's a Monday");
                break;
            case 3:
                System.out.println("It's a Tuesday");
                break;
            case 4:
                System.out.println("It's a Wednesday");
                break;
            case 5:
                    System.out.println("It's a Thursday");
                    break;
            case 6:
                System.out.println("It's a Friday");
                break;
            case 7:
                System.out.println("It's a Saturday");
                break;
            default:
                System.out.println("Invalid number, enter a valid number from 1 to 7");
                break;

        }
        scanner.close();
    }
}
