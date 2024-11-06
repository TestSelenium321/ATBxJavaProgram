package Oct.exe_29102024;

public class Lab06_MinArray {
    public static void main(String[] args) {

        int[] arraymin = {67, 34, 89, 12, 98, 45, 34};
        int array_min = give_min(arraymin);
        System.out.println(array_min);

    }

    static int give_min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

            return min;
        }

}



