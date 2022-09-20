package DS_Pages;

import BaseUtils.BrowserConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class HomePage_I extends BrowserConfig {
    private static Logger logger =  LogManager.getLogger(HomePage_I.class);

    @FindBy(xpath = "//a[@class='dropdown-item']")
    WebElement sixpanes;

    @FindBy(xpath = "//a[contains(text(),'Data Structures')]")
    WebElement datastructdropdown;

    @FindBy(xpath = "//a[@href='linked-list' and contains (text(), 'Get Started')]")
    WebElement Getstarted;

    @FindBy(xpath = "//a[contains (text(), 'Arrays')]")
    WebElement Array;

    @FindBy(xpath = "//a[@href='data-structures-introduction' and contains(text(),'Get Started')]")
    WebElement btnDataStructGetStarted;

    @FindBy(xpath = "//div[contains (text(), 'You are not logged in')]")
    WebElement MsgNotloggedin;

    @FindBy(xpath = "//a[@href='/login']")
    WebElement Signin;

    @FindBy(xpath = "//a[@href='/register']")
    WebElement Registerin;

    public HomePage_I() {
        PageFactory.initElements(driver, this);
}

    public void Notloggedin() {
        System.out.println("Reached Not logged in method");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        datastructdropdown.click();
        Array.click();
        boolean loggedinmsg = MsgNotloggedin.isEnabled();
        System.out.println(loggedinmsg);
        if (loggedinmsg == true) {
            Assert.assertEquals("Success","Successss");;

        }
    }
    public void Notgetselect(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Getstarted.click();
        boolean Clickgetselected = MsgNotloggedin.isEnabled();
        System.out.println(Clickgetselected);
        if(Clickgetselected==true){
            Assert.assertEquals("Success","Success");
        }
    }
    public void getSelect() {
        datastructdropdown.click();
        List<WebElement> elements = driver.findElements(By.xpath("//a[@class='dropdown-item']"));
        logger.info("Total number of dropdown list is "+elements.size());
        Assert.assertEquals(elements.size(),6);
}
    public void ClickSignin(){
        Signin.click();
        String loginpage = driver.getTitle();
        logger.info("Validate Login Page Title");
        Assert.assertEquals(loginpage,"Login");
    }
    public void ClickReg(){
        Registerin.click();
        String regpage = driver.getTitle();
        logger.info("Validate Register Page Title");
        Assert.assertEquals(regpage,"Registration");
    }
}

