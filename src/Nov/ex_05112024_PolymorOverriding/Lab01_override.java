package Nov.ex_05112024_PolymorOverriding;

public class Lab01_override{
    public static void main(String[] args) {
       Animal A1 = new Animal();
       A1.makesound();

       Animal A2 = new dog();
       A2.makesound();;

       Animal A3 = new cat();
       A3.makesound();
    }
}

class Animal {
    public void makesound(){
    System.out.println("This is Animal");
    }
}

class dog extends Animal{
    @Override
    public void  makesound() {
        System.out.println("This dog barks - override Animal");
    }
}

class cat extends Animal{
    public void makesound(){
        System.out.println("This cat meows - override Animal");
    }
}



