package Oct.exe_22102024;

public class Lab03_While {
    public static void main(String[] args) {

        int i = 1;
// we can initiaise any number of value before while loop in this case int i =1 and float pi
        float pi = 3.14f; //f - is  single-precision floating-point constant, default pi value is 3.14
        pi = 5;
        pi = 10;
        System.out.println("The value of pi : " + pi);

        while (i < 10) {
            System.out.println("The value of i = " +i);
            i++;
        }


    }
}
