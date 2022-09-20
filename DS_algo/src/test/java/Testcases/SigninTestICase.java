package Testcases;

import BaseUtils.BrowserConfig;
import DS_Pages.HomePage_I;
import DS_Pages.PortalPage_I;
import DS_Pages.SigninPage_I;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class SigninTestICase extends BrowserConfig {
    SigninPage_I Sign;
    public SigninTestICase(){super();}


    @BeforeTest
    public void TestSignin() throws IOException, ParseException {
        initialization();
        readtestdatafromjson();
        PortalPage_I portal = new PortalPage_I();
        portal.btngetstartedclick();
        portal.validatehomepage();
        HomePage_I Home = new HomePage_I();
        Home.ClickSignin();
        Sign = new SigninPage_I();
    }

    @Test(priority = 1)
    public void EmptyField(){
        Sign.NoDetails();
    }
    @Test (priority = 2)
    public void EmptyPswd(){
        Sign.PassUserName();
    }
    @Test (priority = 3)
    public void EmptyUser(){
        Sign.PassPswd();
    }
    @Test(priority = 4)
    public void InValUserPswd(){
        Sign.InVaUserPawd();
    }
    @Test(priority = 5)
    public void UserPswd(){
        Sign.ValUserPswd();
    }
    @Test (priority = 6)
    public void LogOut(){
        Sign.SigOut();
    }
    @AfterTest
    public void Closebrowser(){
        closebrowser();
    }


}
