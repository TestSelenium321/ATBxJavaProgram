package Dec.exe_12_Program1;

public class RighttrinagleStar {

    //Right Triangle Star Pattern

    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i <=n; i++) {       // Outer loop for each row
            for (int j = 1; j<=i; j++) {    // Inner loop for printing stars in each row
                System.out.print("*");      // Print a star
            }
            System.out.println();            // Move to the next line after printing stars in a row
        }

    }
}
