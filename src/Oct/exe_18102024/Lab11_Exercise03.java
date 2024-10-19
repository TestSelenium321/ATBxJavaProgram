package Oct.exe_18102024;

import java.util.Scanner;
public class Lab11_Exercise03 {
    public static void main(String[] args) {
//Write a program to Check whether a character is a vowel or consonant using switch statement
        //'a', 'e', 'i', 'o', and 'u' are vowels and
        // all other characters ('b', 'c', 'd, 'f'….) are consonants
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check the character is vowel or consonants");
        char chartext = scanner.next().charAt(0);
        // To handel negative numbers and other special charcter we need to include if else condition
        if ((chartext>='A' && chartext<='Z') || (chartext>='a' && chartext<='z'))
        {

            switch (chartext) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    System.out.println("This is a vowel");
                    break;
                default:
                    System.out.println("This is a consonants");
                    break;

            }

        }
        else
        {
            System.out.println("This is Not an alphabet");

        }
    }


}

