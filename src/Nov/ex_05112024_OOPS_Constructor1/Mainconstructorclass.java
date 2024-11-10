package Nov.ex_05112024_OOPS_Constructor1;

public class Mainconstructorclass {
    public static void main(String[] args) {

        Car Tesla = new Car();
        System.out.println(Tesla.name);
        System.out.println(Tesla.year);
        System.out.println(Tesla.model);

        Car nano  = new Car();
        nano.name = "Tatanano";
        System.out.println(nano.name);

    }
}
