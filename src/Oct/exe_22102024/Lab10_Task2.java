package Oct.exe_22102024;

import java.util.Scanner;

public class Lab10_Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the char:");
        String input = scanner.nextLine().toLowerCase();

        int vowels = 0;
        int constants = 0;

        for(int i=0; i<input.length();i++){
            char ch = input.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }else if(ch>='a' && ch<='z'){
                constants++;
            }

        }
        System.out.println("Total  vowels:" + vowels);
        System.out.println("Total constant:" + constants);

        scanner.close();
    }
    }

