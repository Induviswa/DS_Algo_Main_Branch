package Testcases;

import BaseUtils.BrowserConfig;
import DS_Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class ArrayPageITestCase extends BrowserConfig {
    public ArrayPageITestCase() {
        super();
    }
    ArrayPage_I arrayPageI;
    @BeforeTest
    public void ArrayTestcase() throws InterruptedException, IOException, ParseException {
        initialization();
        readtestdatafromjson();
        PortalPage_I portal = new PortalPage_I();
        portal.btngetstartedclick();
        portal.validatehomepage();
        HomePage_I home = new HomePage_I();
        home.ClickSignin();
        SigninPage_I signinPageI = new SigninPage_I();
        signinPageI.ValUserPswd();
        arrayPageI = new ArrayPage_I();
    }
    @Test (priority = 1)
    public void GetStarted(){
        arrayPageI.CkArrayGetSt();
    }
    @Test(priority = 2)
    public void ArraysinPython(){
        arrayPageI.CkArrayPython();
    }
    @Test(priority = 3)
    public void ArrayTryHere(){
        arrayPageI.CkTryHere();
    }
    @Test(priority = 4)
    public void ClickRun1(){
        arrayPageI.CkPyRun();
    }
   @Test(priority = 5)
    public void ClickRun2(){
        arrayPageI.ClickArrayUsingList();
    }
    @Test(priority = 6)
    public void ClickBasOperList() throws InterruptedException {
        arrayPageI.BasicOperationList();
    }
    @Test(priority = 7)
    public void ClickApplicationArray() throws InterruptedException {
        arrayPageI.ApplicationOfArray();
    }

    @AfterTest
    public void CloseBrowser(){
        closebrowser();
    }
}
