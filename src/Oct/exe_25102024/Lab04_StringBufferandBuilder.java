package Oct.exe_25102024;

public class Lab04_StringBufferandBuilder {
    public static void main(String[] args) {


        //Both string builder and string buffer uses append, insert, delete, reverse
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World!");   //single
        sb.append("!").append("java"); //or this append approach
        sb.insert(5, "program");  //HelloprogramWorld!!java
        sb.delete(5, 12); //HelloWorld!!java
      //  sb.reverse(); //avaj!!dlroWolleH
        //System.out.println(sb); or
        System.out.println(sb.toString()); //Converts StringBuilder to String


        StringBuilder stringBuilder = new StringBuilder("Bala");
        stringBuilder.append("murali");
        System.out.println(stringBuilder);
        System.out.println("Lenght is: " + stringBuilder.length());
        System.out.println("Capacity is: " + stringBuilder.capacity());

        //Usual way for combining 2 string using + sign

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);
    }
}
