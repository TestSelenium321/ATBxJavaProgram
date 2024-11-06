package Oct.exe_29102024;

import java.util.Arrays;
public class Lab04_Array_Iterate {
    public static void main(String[] args) {

        int[] marks = {15, 56, 45, 85, 75};
        // int[] marks1 = new int[4];
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("---------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
            System.out.println("---------------");

            Arrays.sort(marks);
           int itembinary = Arrays.binarySearch(marks, 56); //{15, 56, 45, 85, 75} to read as 0,1,2
           System.out.println(itembinary);  //Output is 2

        }
    }
}
