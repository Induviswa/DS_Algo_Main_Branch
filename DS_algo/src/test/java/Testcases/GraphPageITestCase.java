package Testcases;

import BaseUtils.BrowserConfig;
import DS_Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class GraphPageITestCase extends BrowserConfig {
    public GraphPageITestCase() {
        super();
    }

    GraphPage_I graphPageI;

    @BeforeTest
    public void GraphTestcase() throws InterruptedException, IOException, ParseException {
        initialization();
        readtestdatafromjson();
        PortalPage_I portal = new PortalPage_I();
        portal.btngetstartedclick();
        portal.validatehomepage();
        HomePage_I home = new HomePage_I();
        home.ClickSignin();
        SigninPage_I signinPageI = new SigninPage_I();
        signinPageI.ValUserPswd();
        ArrayPage_I arrayPageI = new ArrayPage_I();
        graphPageI = new GraphPage_I();
    }
    @Test(priority = 1)
    public void ClickGrpStdButton(){
        graphPageI.GrGetStarted();
    }
    @Test(priority = 2)
    public void ClickGraphTryHere() throws InterruptedException {
        graphPageI.InGraphClick();
    }
    @Test(priority = 3)
    public void GraRun(){
        graphPageI.ClickRunGraph();
    }
    @Test(priority = 4)
    public void GraRep() throws InterruptedException {
        graphPageI.GrapPres();
    }
    @AfterTest
    public void CloseBrowser(){
        closebrowser();
    }
}
