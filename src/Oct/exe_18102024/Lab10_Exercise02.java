package Oct.exe_18102024;
import java.util.Scanner;

public class Lab10_Exercise02 {
    public static void main(String[] args) {

        // Write a program to read gender(M/F) and print
        // the corresponding gender using a switch statement
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the character: ");
        char gender = scanner.next().charAt(0);
         //String Gender = scanner.next();

        switch(gender) {
            case 'M':
            case 'm':
                System.out.println("Gender is Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Gender is Female");
                break;
            default:
                System.out.println("invalid character, Please enter either M or F");
                break;
        }
        scanner.close();


            }
}
