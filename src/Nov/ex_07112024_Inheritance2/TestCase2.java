package Nov.ex_07112024_Inheritance2;

public class TestCase2 extends CommonBaseClass{
    public TestCase2(){

        System.out.println("Test case2 constructor message");
    }

    void testcase2(){
        startBrowser();
        closeBrowser();
        readExcelFile();
        System.out.println("Testcase2 Pass");
    }
}
