package Oct.exe_17102024;

import java.util.Scanner;

public class Lab01_If {
    public static void main(String[] args) {
    //using if condition check if the user is able to vote if the age is >18 using only "If" condition
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ente the user age");
        int age =scanner.nextInt();
        // Allowed to vote or not
        // If age >= 18 -> allowed to vote.
        if (age>=18) {
        System.out.println("Allowed to vote!");
        }
        scanner.close();
    }
}
