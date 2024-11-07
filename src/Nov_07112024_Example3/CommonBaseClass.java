package Nov_07112024_Example3;

public class CommonBaseClass {
    public CommonBaseClass(){ //Constructor

        System.out.println("CommonBaseclass constructor message");
    }

    void startBrowser(){ //Methods
        System.out.println("Start the browser!");
    }
    void closeBrowser(){
        System.out.println("Close the browser!");
    }
    void readExcelFile(){
        System.out.println("Reading the File!");
    }
}
