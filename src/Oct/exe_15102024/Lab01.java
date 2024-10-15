package Oct.exe_15102024;

public class Lab01 {
    public static void main(String[] args) {

        // Largest of Three Numbers a,b,c using the Ternary Operator.

        int a = 30;
        int b = 70;
        int c= 100;
        int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The largest number is: " + result);


        int e = 10;
        System.out.println(++e + e++ + e++);
        // 11 + 11+ 12 = 34
        // 13
        System.out.println(e);

        int f = 20;
        System.out.println(--f + f++ + f--);

        //19+21+19
    }
}


/*The largest number is: 100
        34
        13
        58 */