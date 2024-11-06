package Oct.exe_29102024;

public class Lab03_Array_String {
    public static void main(String[] args) {
        String[] names = {"pramod","amit","lucky"};
        String[] names_atb9x = new String[3];
        names_atb9x[0] = "Aditi";
        names_atb9x[1] = "Jitin";
        names_atb9x[2] = "Nikita";
        System.out.println(names_atb9x.length);

         System.out.println("---------------------");
         System.out.println(names_atb9x[0]);
          System.out.println(names_atb9x[1]);
          System.out.println(names_atb9x[2]);
         // System.out.println(names[3]);

        System.out.println("---------------------");
        boolean[] is_male_data = new boolean[2];
        is_male_data[0] = true;
        is_male_data[1] = false;
        System.out.println(is_male_data[0]);
        System.out.println(is_male_data[1]);
        System.out.println(is_male_data.length);

    }
}
