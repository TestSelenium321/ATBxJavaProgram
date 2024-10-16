package Oct.exe_16102024;

import java.util.Scanner;

//User input using scanner class

public class Lab01_Scanneruserinput {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter the marks");
    int marks = scanner.nextInt();
        //float marks = scanner.nextFloat();
       // double marks = scanner.nextDouble();

    System.out.println(marks > 50 ? "Pass" : "Fail");
    scanner.close();
    }
}
