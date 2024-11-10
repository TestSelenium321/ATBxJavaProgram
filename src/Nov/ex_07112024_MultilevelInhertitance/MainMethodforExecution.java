package Nov.ex_07112024_MultilevelInhertitance;

public class MainMethodforExecution {
    public static void main(String[] args) {

        //In multi-level inheritance, a class extends a class which in turn
        // extends another class
        //It forms a chain of inheritance (like a family tree in a straight line:
        // Grandfather → Father → Son)

        Child c1 = new Child();
        c1.gf();
        c1.home();
        c1.f();
        c1.c();
        System.out.println("--------------");
        Father f1 = new Father();
            f1.f();
            f1.home();
            f1.gf();
            f1.father_extra();
        System.out.println("--------------");
            Grandfather g1 = new Grandfather();
            g1.gf();
            g1.home();

            }
        }

