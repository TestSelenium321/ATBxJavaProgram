package Oct.exe_09102024;

public class Lab01_Printf {

    public static void main(String[] args) {
        // It will replace the value in the %
        //%d -> int, byte, long, short
        int sample1 = 5 ;
        System.out.printf("%d x %d = %d", sample1, 1, sample1*1);
        System.out.println();
        System.out.printf("%d x %d = %d", sample1, 2, sample1*2);
        System.out.println();
        System.out.printf("%d x %d = %d", sample1, 3, sample1*3);
        System.out.println();
        System.out.printf("%d x %d = %d", sample1, 4, sample1*4);
        System.out.println();

        byte sample2 = 127;
        System.out.printf("%d x %d = %d", sample2, 1, sample2*1);
        System.out.println();
        System.out.printf("%d x %d = %d", sample2, 2, sample2*2);
        System.out.println();
        System.out.printf("%d x %d = %d", sample2, 3, sample2*3);
        System.out.println();
        System.out.printf("%d x %d = %d", sample2, 4, sample2*4);
        System.out.println();

        short sample3   = 32767;
        System.out.printf("%d x %d = %d", sample3, 1, sample2*1);
        System.out.println();
        System.out.printf("%d x %d = %d", sample3, 2, sample3*2);
        System.out.println();
        System.out.printf("%d x %d = %d", sample3, 3, sample3*3);
        System.out.println();
        System.out.printf("%d x %d = %d", sample3, 4, sample3*4);
        System.out.println();
    }
}
