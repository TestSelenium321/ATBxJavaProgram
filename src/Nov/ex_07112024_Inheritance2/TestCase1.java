package Nov.ex_07112024_Inheritance2;

public class TestCase1 extends CommonBaseClass {

    public TestCase1(){
        System.out.println("------------------");
        System.out.println("Test case1 constructor message");
    }

    public void testcase(){
        startBrowser();
        closeBrowser();
        readExcelFile();
        System.out.println("Testcase1 Pass");
        System.out.println("------------------");
    }
}
