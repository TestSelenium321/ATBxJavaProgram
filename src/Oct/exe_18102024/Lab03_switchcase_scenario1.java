package Oct.exe_18102024;

import java.util.Scanner;

public class Lab03_switchcase_scenario1 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge browser cases.

        Scanner scanner = new Scanner (System.in);
        System.out.println("Execute the browser to run the code");
        String browser = scanner.next();

        switch (browser){
            case "chrome":
                System.out.println("Start the chrome browser");
                break;
            case "firefox":
                System.out.println("Start the firefox browser");
                break;
            case "edge":
                System.out.println("Start the edge browser");
                break;
            default:
                System.out.println("Not a valid browser");
                break;

        }
        scanner.close();
    }
}
