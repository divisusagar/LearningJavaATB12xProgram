package ex_19_OOPs_Part2.superKeyword;

public class Lab180 {

}

class BaseClass {
    private String browser;

    public BaseClass(String browser) {
        this.browser = browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if (isAdmin){
            this.browser = browser;
        } else {
            System.out.println("Change Browser is Not Allowed, Not a Admin");
        }
    }

    public String getBrowser() {
        return browser;
    }

    void openBrowser() {
        System.out.println("Opening a Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser !! -> "+browserName);
    }

    void closeBrowser() {
        System.out.println("Close Browser !!");
    }
}

class TestCase1 extends BaseClass {
    public void tc(){
        System.out.println("TestCase1 -> tc function");
    }
    public TestCase1(String browser) {
        super(browser);
        super.openBrowser();
        super.openBrowser("chrome");
        super.closeBrowser();

        this.tc();
    }
}
