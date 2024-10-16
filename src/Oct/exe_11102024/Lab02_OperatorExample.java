package Oct.exe_11102024;

public class Lab02_OperatorExample {
    public static void main(String[] args) {

        //Arithmetic operators -->   +  -  *  /   %    (% - modulus)
       int a = 55;
        int b = 35;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println("---------");

   //Relational/Comparision Operators -->  >  >= <  <=  != ==  (!= Not equal to), (== Equalto)
        // Result should be either boolean format - True or False

        int c = 67;
        int d = 37;
      System.out.println(c>d);
       System.out.println(c>=d);
        System.out.println(c<d);
        System.out.println(c<=d);
         System.out.println("c!=d" + "=" + (c!=d));
        System.out.println(c==d);
       System.out.println("---------");

       // Logical operators  --> = && || !  - AND, OR and NOT, && (Both value should be same), || (Any one value should mactch)
        //Result should be either boolean format - True or False

        boolean x= true;
        boolean y= false;
        System.out.println("x&&y "+(x&&y));
        System.out.println("x||y "+(x||y));
        System.out.println("!y "+(!y));
        System.out.println("---------");

        //Increment and Decrement operators  -->  ++ --

        int e = 2 ;
        System.out.println(e++); //A->2, e->3
        System.out.println(++e); //B ->4 , e->4
        System.out.println("---------");
        int f = 18 ;
        System.out.println(f--); //A->18, e->17
        System.out.println(--f); //B ->16 , e->16
        System.out.println("---------");

        //Assignament operator --> = +=  -=  *= /= %=

        int p = 10;
        System.out.println("Result is: " + (p += 5));  //f value is 15
        System.out.println("Result is: " + (p -= 5));  //f value is 15-5 = 10
        System.out.println("Result is: " + (p *= 5));  //f value is 10*5 = 50
        System.out.println("Result is: " + (p /= 5));  //f value is 50/5 = 10
        System.out.println("Result is: " + (p %= 5));  //f value is 10%5 = 0
        System.out.println("---------");

       // Conditional or Ternary Operator --> ?: max of all numbers
            int g = 50;
            int h = 30;
            int i = 100;
            //int result = (g>h)? g : h;
           int result = (g>=h && g>=i)? g : (h>=i ? h :i);
           // System.out.println("The max number is "+g+" and "+h+ " is:" + result);
          System.out.println(result);
        System.out.println("---------");

        // Bitwise operators
        int u=5, v=3;
        System.out .println(u&v); //Bitwise AND
        // Output: 1 (Binary: 0101 & 0011 = 0001)
        System.out.println(u|v);  //Bitwise OR
        //(Binary: 0101 | 0011 = 0111)
        System.out.println(u^v);  //Bitwise XOR
        //(Binary: 0101 ^ 0011 = 0110)
        System.out.println(~u);   //Bitwise NOT
        System.out.println("---------");

            /*     a = 5 = 0101 (In Binary)
            Bitwise Complement Operation of 5 in java (8 bits)
            ~ 00000101
            ________
            11111010  = 246 (In decimal)
            The bitwise complement of 5 is 246 and The 2’s complement of 246
            is -6. Hence, the output is -6 instead of 246.
            bitwise complement of N = ~N (represented in 2's complement form)
            2'complement of ~N = -(~(~N)+1)  =  -(N+1). */

        //Shift Operators
        int l=5;
        System.out.println(l<<1);  //Output: 10 (5 * 2^1)
        int m=8;
        System.out.println(m>>1);  //Output: 4 (8 / 2^1)
        System.out.println("---------");

        //Instanceof Operator
        String str="Hello";
        System.out.println(str instanceof String);
           /*The instance of the operator is used for type checking.
           It can be used to test if an object is an instance of a class,
           a subclass, or an interface. General format-
           object instance of class/subclass/interface */

        //Type casting operator
        double k=9.2;
        int w=(int)k;
        System.out.println(w);
    }
}
