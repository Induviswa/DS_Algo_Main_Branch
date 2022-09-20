package Testcases;

import BaseUtils.BrowserConfig;
import DS_Pages.PortalPage_I;
import DS_Pages.HomePage_I;
import DS_Pages.RegistrationPage_I;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegistrationPageITestCase extends BrowserConfig {
    RegistrationPage_I reg;
    public RegistrationPageITestCase(){
        super();
    }

    @BeforeTest
    public void TestLogin() throws IOException, ParseException {
        initialization();
        readtestdatafromjson();
        PortalPage_I portal = new PortalPage_I();
        portal.btngetstartedclick();
        portal.validatehomepage();
        HomePage_I home = new HomePage_I();
        home.ClickReg();
        reg = new RegistrationPage_I();
    }
    @Test (priority = 1)
    public void allblanktest() {
    reg.allblank();
    }
    @Test (priority = 2)
    public void password1blanktest() throws InterruptedException {
        reg.passwordblank();
    }
    @Test (priority = 3)
    public void password2blanktest() throws InterruptedException {
        reg.password2blank();
    }
    @Test (priority = 4)
    public void invalidusernameformatvalidation() throws InterruptedException {
        reg.invalidusernameformat();
    }
     @Test(priority = 5)
     public void valdPasswdMisMth() throws InterruptedException {
        reg.Difpasswords();
     }
     @Test (priority = 6)
     public void ValdReg(){
        reg.UserPswd();
     }
     @AfterTest
    public void Closebrowser(){
        closebrowser();
    }
}

