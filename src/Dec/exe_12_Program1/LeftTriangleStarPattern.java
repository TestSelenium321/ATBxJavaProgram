package Dec.exe_12_Program1;

public class LeftTriangleStarPattern {
    // Left Triangle Star Pattern

    public static void main (String[] args) {

        int n=6;
        for (int i=n; i>=1; i--) {
             for (int j=1; j<=i; j++) {
                 System.out.print("*");
             }
             System.out.println();
        }
    }

}
