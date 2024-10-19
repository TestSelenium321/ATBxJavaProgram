package Oct.exe_18102024;
import java.util.Scanner;
public class Lab17_VoteSwitchcase {
    public static void main(String[] args) {

        //Write a program to check whether a person
        // is eligible to vote or Not using switch statement
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        switch (age) {
            case 18:
                System.out.println("eligible to Vote");
                break;

            default:
                System.out.println("Note eligible to vote");
                break;
        }

        scanner.close();

        }

    }

