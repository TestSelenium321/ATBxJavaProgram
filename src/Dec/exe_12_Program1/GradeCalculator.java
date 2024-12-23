package Dec.exe_12_Program1;

/*Grade Calculator:
Write a program that calculates and displays the letter grade for a
 given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 85;
0-59*/

public class GradeCalculator {

    public static void main (String [] args){

        int score = 85;
        char grade;

        if (score >= 90 && score <=100) {
            grade = 'A';
        }
        else if (score >=80 && score <=89){
            grade = 'B';
        }
        else if (score >=70 && score <=79) {
            grade = 'C';
        }
        else if (score >=60 && score <=69){
            grade = 'D';
        }
        else{
            grade = 'F';
        }
        System.out.println("Your grade is: " + grade);
    }
}