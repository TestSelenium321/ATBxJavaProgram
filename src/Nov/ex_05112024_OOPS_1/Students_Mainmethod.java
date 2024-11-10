package Nov.ex_05112024_OOPS_1;

public class Students_Mainmethod{
    public static void main(String[] args) {

        Students S1 = new Students();
        S1.name = "Bala";
        S1.age = 40;
        S1.Phone_number = 353763663;
        S1.grade = 'A';
        S1.Class(10);
        System.out.print(S1);
        S1.student_dress();
        S1.student_Bus(1);
        System.out.print(S1);

        Students S2 = new Students();
        S2.name = "Karthik";
        S2.Class(20);
        System.out.print(S2);
    }
}
