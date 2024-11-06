package Oct.exe_29102024;

import java.util.Arrays;
public class Lab05_MaxArray {
    public static void main(String[] args) {

        int[] array = {30, 20, 67, 87, 98, 56, 98};
         int max_value = give_max(array);
         System.out.println(max_value);
    }

         static int give_max (int[] array){
         int max = array[0];
         for (int i =0; i< array.length; i++){
           if (array[i] > max) {
            max = array[i];
            }

        }
 return max;
         }

}
