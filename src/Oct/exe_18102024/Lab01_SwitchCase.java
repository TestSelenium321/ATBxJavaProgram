package Oct.exe_18102024;
import java.util.Scanner;
public class Lab01_SwitchCase {
    public static void main(String[] args) {
        // Switch Condition
        // User - Enter int number from 1 to 7
        // switch case consists of Which day it is it
        // 1 -> mon, 4 -> thur, 7 -> sun, 8,9,10....-1 -> Invalid

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7 to display Monday to Sunday");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid input");
                break;
        }
         scanner.close();

    }
             }



