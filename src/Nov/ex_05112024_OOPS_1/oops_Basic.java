package Nov.ex_05112024_OOPS_1;

public class oops_Basic {
    public static void main(String[] args) {

        Dog D1 = new Dog();
        D1.name = "Rossey";
        D1.Sleep();
        System.out.println(D1.name);

    }

    static class Dog {
        String name;


        void Sleep() {
            System.out.println("Dog is sleeping");
        }
    }
}


