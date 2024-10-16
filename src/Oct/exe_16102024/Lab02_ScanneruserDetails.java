package Oct.exe_16102024;

import java.util.Scanner;

public class Lab02_ScanneruserDetails {
    public static void main(String[] args) {
        //Take a user input - Name, Age and Salary and print them in the end.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name");
        String Name = scanner.next();
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        System.out.println("Enter the salary");
        float salary = scanner.nextFloat();

        System.out.println("Employe Name is: "+Name+ "," + "Employee age is: "+age+ "," + "Employee salary is: " +salary);

       scanner.close();







    }

}
