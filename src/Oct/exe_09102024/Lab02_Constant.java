package Oct.exe_09102024;

public class Lab02_Constant {
    public static void main(String[] args) {
        final int a = 10;
        //a= 20; //we can't change "a" value as we have declared it as constant
               //cannot assign a value to final variable a
        System.out.println(a);

        final String name = "Javaprogram";
        System.out.println(name);

        /*Constants**

            - Special variable whose **value can't be modified during the program execution.**
            - One created and SET THE VALUE , we will not able to modify.
            - PI - 3.14 , this value should be change during the execution of the program.
            - Constant is also called as **final** variable
             - If you try to change the value - `java: cannot assign a value to final variable PI`*/

    }
}
