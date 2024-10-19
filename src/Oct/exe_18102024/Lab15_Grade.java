package Oct.exe_18102024;

import java.util.Scanner;
public class Lab15_Grade {
    public static void main(String[] args) {
        // Write a program to print remark according to the grade obtained using switch statement

        Scanner scanner = new Scanner(System.in);

        System.out.println("Grades are: 'A', 'B, 'C', 'D'");
        System.out.printf("Enter the Grade: ");

       char grade = scanner.next().charAt(0);
       char m = Character.toUpperCase(grade);
       //char grade = Character.toUpperCase(m);

        switch (m){
            case 'A':
               System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
                break;

            }
            scanner.close();

        }

    }

