package Oct.exe_11102024;

public class Lab02_Typecasting_Narrowing {
    public static void main(String[] args) {

      /*  double i = 100.234;
        short j = (short)i;
        int k = (int)i;

        System.out.println("Original value before casting: " + i);
        System.out.println("after type casting to short: "+ j);
        System.out.println("After type casting to int: " + k);*/

        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9



        /*Narrowing -  bigger data type into a smaller one is known as narrowing type casting.
                    - Data loss
                    - Casting up or explicit type casting
           Syntax - smaller_data_type variable_name = (smaller_data_type) larger_data_type_variable;
            double -> float -> long -> int -> char -> short -> byte
         */
    }
}
