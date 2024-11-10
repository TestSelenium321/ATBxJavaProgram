package Nov.ex_07112024_MultilevelInhertitance;

public class Father extends Grandfather{

    void home(){
        System.out.println("Father 2BHK");
    }
    void f(){
        System.out.println("father class extended to grandfather");
    }
    void father_extra() {
        System.out.println("Additional info along with extended father class");
    }
}

