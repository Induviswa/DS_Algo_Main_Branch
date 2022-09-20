package Testcases;

import BaseUtils.BrowserConfig;
import DS_Pages.PortalPage_I;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.*;

public class PortalPageITestcase extends BrowserConfig {
    PortalPage_I Portal;
    public PortalPageITestcase(){
        super();
    }
    //Actions to be performed before test starts
    @BeforeTest
    public void Portalpagelaunch(){
        initialization();
        Portal = new PortalPage_I();
    }

    //Test cases
    @Test(priority = 1)
    @Feature("DS Algo Portal Page")
    @Description("Validate Portal launch")
    public void Validateportal(){
        Portal.portalpage();
    }
    @Description("Validate Home launch")

    @Test(priority = 2)
    public void GetStarted() throws InterruptedException {
        Portal.btngetstartedclick();
        Portal.validatehomepage();
    }
    //Actions to be performed after test completes
 @AfterTest
    public void CloseBrowser(){
        closebrowser();
 }

}
