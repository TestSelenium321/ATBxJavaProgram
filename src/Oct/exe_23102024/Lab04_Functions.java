package Oct.exe_23102024;

public class Lab04_Functions {
    //3.With Parameters and Without Return Type

    public void displayUserInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Another example: Calculate and display sum
    public void calculateAndDisplaySum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }
    // Method to print a message multiple times

    public void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) ;
        System.out.println(message);
    }


    public static void main(String[] args) {
        // Create object to call methods
        Lab04_Functions demo = new Lab04_Functions();

            // Call methods with different parameters

            demo.displayUserInfo("John",25);
            demo.calculateAndDisplaySum(10,20);
            demo.printMessage("Hello",3);
        }
    }
