package Oct.exe_29102024;

public class Lab02_Array_FixedSize {
    public static void main(String[] args) {

        int[] marks = new int[5]; //Fixed size
        System.out.println(marks.length);
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;
        System.out.println("------------------");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //System.out.println(marks[-1]); //exception in thread "main"
        // java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5

        //System.out.println(marks[10]); //Exception in thread "main"
        // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5



    }
}
