package Oct.exe_23102024;

public class Lab03_Functions {
    public static void main(String[] args) {
        //1. Without Argument / Parameters and Without Return Type.
        Lab03_Functions calculator = new Lab03_Functions();

        calculator.displayHeader();
        calculator.performAddition();
        calculator.performSubtraction();
        calculator.performMultiplication();
        calculator.performDivision();
        calculator.displayFooter();
    }
        public void displayHeader(){
                System.out.println("**********************");

        }
        public static void performAddition()  {
            int a = 10;
            int b = 5;
            int result = (a+b);
            System.out.println("The result of addition is a+b is: " + result);

        }

        public void performSubtraction() {
            int a = 10;
            int b = 5;
            int result = (a - b);
            System.out.println("The result of subtraction is a-b is: " + result);
        }
        public void performMultiplication() {
            int a = 30;
            int b = 15;
            int result = (a - b);
            System.out.println("The result of multiplication is a*b is: " + result);
        }
        public void performDivision() {
            int a = 40;
            int b = 20;
            int result = (a / b);
            System.out.println("The result of Division is a/b is: " + result);
        }
        public void displayFooter() {
            System.out.println("*******************************");
        }
    }

