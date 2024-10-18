package Oct.exe_17102024;

import java.util.Scanner;

public class Lab08_Task1701 {
    public static void main(String[] args) {
        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F)
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade is: " + "A");
        }
        else if (score >= 80 && score <= 89) {
            System.out.println("Grade is: " + "B");
        }
        else if (score >= 70 && score <= 79) {
            System.out.println("Grade is: " + "C");
        }
        else if (score >= 60 && score <= 69){ ;
        System.out.println("Grade is: " + "D");
        }
        else if (score >= 0 && score <= 59){
            System.out.println("Grade is: " + "F");
            }
        else if (score <0 && score>100){  // always add edge case to the program
            System.out.println("Thi is invalid, Please enter valid score");
        }
        else{
            System.out.println("Number is not valid, Please enter the valid number");
        }
        }
    }

