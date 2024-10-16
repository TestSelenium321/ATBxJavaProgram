package Oct.exe_15102024;

public class Lab01 {
    public static void main(String[] args) {

        // Largest of Three Numbers a,b,c using the Ternary Operator.
        /*The expression `(a >= b && a >= c)`  checks if _a_ is greater than or equal to both _b_ and _c_. If true, it assigns _a_ to `largest` .
        - If _a_ is not the largest, it evaluates `(b >= c)` .
        If true, it assigns _b_; otherwise, it assigns _c_
         */

        //result = condition1 ? expression1 : (condition2 ? expression2 : expression3);


        int a = 30;
        int b = 70;
        int c= 100;
        int result = (a>=b && a>=c) ? a : (b>=c? b : c);
        System.out.println("The largest number is: " + result );
        System.out.println();

        int e = 10;
        System.out.println(++e + e++ + e++);
        // A -> ++e -> Exp1 -> 11, e-> 11
        // B -> e++ -> Exp2 -> 11 , e -> 12
        // C ->  e++ -> Exp3 -> 12 ,  e -> 13
        //we need to add th expression and not the 'e" value
        System.out.println(e);
        System.out.println();

        int f = 20;
        System.out.println(--f + f++ + f--);

       //A -> --F -> Exp 1 -> 19, f ->19
       // B -> --F -> Exp 2 -> 20, f ->21
        // c -> --F -> Exp 3 -> 21, f ->20

        //19+20+21

    }
}


/*The largest number is: 100
        34
        13
        58 */