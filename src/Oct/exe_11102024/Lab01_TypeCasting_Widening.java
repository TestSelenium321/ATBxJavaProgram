package Oct.exe_11102024;

public class Lab01_TypeCasting_Widening {
    public static void main(String[] args) {

        int i = 10;
        long l = i;
        double d = i;
        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Double: " + d);


        /*Typecasting in Java
       Typecasting in Java is the process of converting one data type to another
       data type using the casting operator When you assign a value from one primitive
       data type to another type, this is known as type casting.

       byte -> short -> char -> int -> long -> float -> double

       Syntax - <datatype> variableName = (<datatype>) value;

       Types - Widening and Narrowing type casting

       Widening - Lower data type to higher data type
                - No data loss
                - Implicit type casting or casting down
         Syntax - larger_data_type variable_name = smaller_data_type_variable;
 */

    }


}
