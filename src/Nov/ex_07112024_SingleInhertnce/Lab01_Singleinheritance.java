package Nov.ex_07112024_SingleInhertnce;


public class Lab01_Singleinheritance {
    public static void main(String[] args) {

        // Single Inheritance
        // Son will get the attributes from Father.
        // 1 son and 1 father.

        Lab01_Son s1 = new Lab01_Son();
        System.out.println(s1.gold_f);
        System.out.println(s1.bike_value_s);
        s1.bhk2(); // Son has extended
        s1.bhk3();

        Lab01_Father f1 = new Lab01_Father();
        // f1.bhk3(); Father has not extended


        /*------
        1000
        1500
        2bhk
        3bhk*/
    }
}

