package Testcases;

import BaseUtils.BrowserConfig;
import DS_Pages.Data_StructurePage_I;
import DS_Pages.HomePage_I;
import DS_Pages.PortalPage_I;
import DS_Pages.SigninPage_I;
import io.qameta.allure.Attachment;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Data_StructurePageITestCase extends BrowserConfig {
    public Data_StructurePageITestCase(){
        super();
    }
    Data_StructurePage_I DataStuctpage;
    @BeforeTest
    public void DataStructurepage() throws InterruptedException, IOException, ParseException {
        initialization();
        readtestdatafromjson();
        PortalPage_I portal = new PortalPage_I();
        portal.btngetstartedclick();
        portal.validatehomepage();

        HomePage_I home = new HomePage_I();
        home.ClickSignin();

        SigninPage_I signinPageI = new SigninPage_I();
        signinPageI.ValUserPswd();
        DataStuctpage = new Data_StructurePage_I();
    }
    @Test(priority = 1)
    public void datastructGetStarted(){
        DataStuctpage.clkDataStructGetStd();
    }

    @Test(priority = 2)
    public void lnktimecomplex(){
        DataStuctpage.lnkTimeComplexity();
    }

    @Test(priority = 3)
    @Attachment(value = "Screenshot",type="image/png")
    public void lnkpracticequestion(){
        DataStuctpage.lnkPracticeQuestion();
    }

    @Test(priority = 4)
    public void TryHereAssessment() throws InterruptedException {
        DataStuctpage.lnkTryHere();
    }

    @AfterTest
    public void teardown(){
        closebrowser();
    }
}
