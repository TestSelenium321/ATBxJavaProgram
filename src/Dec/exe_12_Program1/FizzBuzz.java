package Dec.exe_12_Program1;

/*Write a program that prints numbers from 1 to 100. ,
For numbers that are divisible of both 3 and 5, print "FizzBuzz".
for divisible of 3, print "Fizz"
for divisible of 5,print "Buzz."
Otherwise, print the number itself"*/

public class FizzBuzz {

    public static void main(String[] args) {

        for ( int i = 1; i<=100; i++) {

            if (i % 3 ==0 && i % 5 ==0) {
                System.out.println("FizzBuzz");
            }
             else if (i % 3 ==0) {
                    System.out.println("Fizz");
                }
             else if (i % 5 ==0) {
                    System.out.println("Buzz");
               }
             else {
                 System.out.println(i);
                }
            }
        }

    }














