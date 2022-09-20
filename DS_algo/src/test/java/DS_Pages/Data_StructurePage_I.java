package DS_Pages;

import BaseUtils.BrowserConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Data_StructurePage_I extends BrowserConfig {
    private static Logger logger = LogManager.getLogger(Data_StructurePage_I.class);

    @FindBy(xpath = "//a[@href='data-structures-introduction' and contains(text(),'Get Started')]")
    WebElement btnDataStructGetStarted;

    @FindBy(xpath = "//a[@href='time-complexity' and contains(text(),'Time Complexity')]")
    WebElement lnkTimecomplexity;

    @FindBy(xpath = "//a[@href='/data-structures-introduction/practice' and contains(text(),'Practice Questions')]")
    WebElement lnkPracticeQuestion;

    @FindBy(xpath = "//a[@href='/tryEditor' and contains(text(),'Try here')]")
    WebElement btnTryHere;

    @FindBy(xpath = "//span[@role='presentation']")
    WebElement boxentercodehere;

    @FindBy(xpath = "//button[@type='button' and contains(text(),'Run')]")
    WebElement btnRun;

    @FindBy(xpath = "//pre[@id='output']")
    WebElement valoutputmsg;

    public Data_StructurePage_I() {
        PageFactory.initElements(driver, this);
    }

    public void clkDataStructGetStd() {
        btnDataStructGetStarted.click();
        String valDataStructtitlepage = driver.getTitle();
        Assert.assertEquals(valDataStructtitlepage, "Data Structures-Introduction");
        logger.info("Get started button click successfull");
    }

    public void lnkTimeComplexity() {
        lnkTimecomplexity.click();
        String valTimecomplexpage = driver.getTitle();
        Assert.assertEquals(valTimecomplexpage, "Time Complexity");
        logger.info("Time Complexity link clicked successfull");
    }

    public void lnkPracticeQuestion() {
        lnkPracticeQuestion.click();
        String valpracquestionpage = driver.getTitle();
        Assert.assertEquals(valpracquestionpage.trim(), "Practice Questions");
        logger.info("Practice Questions link clicked successfull");
    }

    public void lnkTryHere() throws InterruptedException {
            driver.navigate().back();
            btnTryHere.click();
            String pythoncode = "print(\"Hello World\")";
            String valTryHerePage = driver.getTitle();
            Assert.assertEquals(valTryHerePage.trim(), "Assessment");
       //Pass Python code
        Actions a = new Actions(driver);
        a.sendKeys(pythoncode);
        a.perform();
            btnRun.click();
            Assert.assertEquals(valoutputmsg.getText(),"Hello World");
            logger.info("Data Structure code validation completed successfull");
    }
}