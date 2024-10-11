package Oct.exe_09102024;

public class Lab01_Printf {

    public static void main(String[] args) {
        // It will replace the value in the %
        //%d -> int, byte, long, short
        int sample1 = 5 ;
        System.out.printf("%d x %d = %d", sample1, 1, sample1*1);
        System.out.println(); // print the data in next line
        System.out.printf("%d x %d = %d", sample1, 2, sample1*2);

        byte sample2 = 127;
        System.out.printf("%d x %d = %d", sample2, 1, sample2*1);
        System.out.println();
        System.out.printf("%d x %d = %d", sample2, 2, sample2*2);
        System.out.println();


        short sample3   = 32767;
        System.out.printf("%d x %d = %d", sample3, 1, sample2*1);
        System.out.println();
        System.out.printf("%d x %d = %d", sample3, 2, sample3*2);
        System.out.println();
        System.out.printf("%d x %d = %d", sample3, 3, sample3*3);
        System.out.println();

        long sample4 = 767656565L;
        System.out.printf ("This is long data type %d",sample4);
        System.out.println();

        //  %s -> String
        String sample5 = "Myprogram";
        System.out.printf ("This is string data type %s",sample5);
        System.out.println();

        //%f -> floating, double
        float sample6 = 3.12f;
        System.out.printf ("This is float data type %f",sample6);
        System.out.println();

        double sample7 = 3.2342342342344;
        System.out.printf("This is double data type %f",sample7);
        System.out.println();
        //%b -> boolean

        boolean sample8 = true;
        System.out.printf("This is boolean data type %b",  sample8);





    }
}
