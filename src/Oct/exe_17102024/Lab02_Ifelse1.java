package Oct.exe_17102024;

import java.util.Scanner;

public class Lab02_Ifelse1 {
    public static void main(String[] args) {
     //using if condition check if the user is Allowed to vote or NOT if
        // the age is >18 using only "If else" condition

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the age");
            int age = scanner.nextInt();
            //Check if the use is allowed to vote or not using if else
            if (age>=18){
            System.out.println("Allowed to vote");
             }
            else {
            System.out.println("Not allowed to vote");
             }
            scanner.close();
    }
}
