package Testcases;

import DS_Pages.HomePage_I;
import DS_Pages.PortalPage_I;
import BaseUtils.BrowserConfig;
import org.testng.annotations.*;

public class HomePageITestcase extends BrowserConfig {

    public HomePageITestcase(){
        super();
    }

    @BeforeTest
    public void TestLogin() throws InterruptedException {
    initialization();
    PortalPage_I home = new PortalPage_I();
    home.btngetstartedclick();
    home.validatehomepage();
    }

    @Test(priority = 1)
    public void validatehomepage(){
        HomePage_I login = new HomePage_I();
        login.Notloggedin();
    }
    @Test(priority = 2)
    public void validategetstarted(){
        HomePage_I login = new HomePage_I();
        login.Notgetselect();
    }
    @Test(priority = 3)
    public void Clickstarted(){
        HomePage_I login = new HomePage_I();
        login.getSelect();
    }
    @Test(priority = 4)
    public void Clicklogin(){
        HomePage_I login = new HomePage_I();
        login.ClickSignin();
    }
    @Test(priority = 5)
    public void ClickReg(){
        HomePage_I login = new HomePage_I();
        login.ClickReg();
    }
    @AfterTest
    public void CloseBrowser(){
        closebrowser();
    }
}
