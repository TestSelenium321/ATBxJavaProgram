package Oct.exe_18102024;

import java.util.Scanner;

public class Lab02_Switchcase_WithoutBreak{

    public static void main (String[]args){

        //Without break statement

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7 which represents Monday to Sunday");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("wednesday");
            case 4:
                System.out.println("Thurday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Not a valid input");
        }
        scanner.close();
    }
}
