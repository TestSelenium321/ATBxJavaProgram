package Nov.ex_05112024_Overloading;

public class Poly_Overloading {
    public static void main(String[] args) {

        MathOperations MO = new MathOperations();
        MO.add(1, 2, 3);

    }
}

        class MathOperations  {

            // Method Overloading
            // Method will be Over load
            // Method overloading is a feature in Java that allows a class to have
            //multiple methods with the same name but different parameters.
            // The parameters can differ in:
             //Number of parameters, //Data type of parameters, //Order of parameters

            void add(){
                System.out.println("Adding");
            }

            int add(int a, int b){
                return a+b;
            }

            float add (float a, float b){
                return a+b;
            }

            double add (double a, double b){
                return a+b;
            }

            void add(int a, int b, int c) {
                System.out.println("Hello");
            }
                double add (double c, double d, float f){
                    return c+d+f;
                }
            }



