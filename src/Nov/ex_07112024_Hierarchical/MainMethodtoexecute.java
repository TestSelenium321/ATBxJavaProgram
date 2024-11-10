package Nov.ex_07112024_Hierarchical;

public class MainMethodtoexecute {
    public static void main(String[] args){

        Father F1 = new Father();
        F1.home();
        System.out.println("----------------");

        FirstSon S1 = new FirstSon();
        S1.home();
        S1.BaiscBike();
        S1.SportsBike();
        System.out.println("----------------");

        SecondSon S2 = new SecondSon();
        S2.home();
        S2.NormalCycyle();
        S2.SportsCycyle();
        System.out.println("----------------");


        Daughter D = new Daughter();
        D.home();
        D.Scooter();

    }
}
