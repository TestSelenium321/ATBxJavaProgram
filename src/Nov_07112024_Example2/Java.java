package Nov_07112024_Example2;

public class Java extends Programming{

    void print(){//method which is inheritted and print from programming
        System.out.println(author);
        System.out.println(version);
    }

    Java(){
        System.out.println("child Java");
    }

    public static void main(String[] args){
        Java j1 = new Java();
        System.out.println(j1.author);

    }

}
