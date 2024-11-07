package Nov_07112024_MultipleInhertitance;

public class MainMethodforExecution {
    public static void main(String[] args) {

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

