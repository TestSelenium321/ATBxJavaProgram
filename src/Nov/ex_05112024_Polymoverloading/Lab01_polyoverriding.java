package Nov.ex_05112024_Polymoverloading;

public class Lab01_polyoverriding {
    public static void main(String[] args) {
        //Method overloading is a feature in Java that allows a
        // class to have multiple methods with the same name,
        // as long as they have different parameters.
        Mathoperation obj = new Mathoperation();
        obj.add(1, 3);
    }
}

        class Mathoperation {

            void add(){
                System.out.println("NO return type and no argument");

            }

            int add(int a, int b){
                return a+b;
            }

            float add (float a, float b){
                return a + b;
            }
             double add (double a, double b){
                return a + b;
 }

          void add (int a, int b, int c){
                System.out.println("NO return type and with parameter");
          }

          double add(double a, double b, float f){
                return a + b+ f;
          }
                   }



