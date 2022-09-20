package DS_Pages;

import BaseUtils.BrowserConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegistrationPage_I extends BrowserConfig {
    public static String Username = "MidHigh";
    public static String Password1 = "Unseen467";
    public static String Password2 = "Unseen467";
    private static Logger logger = LogManager.getLogger(RegistrationPage_I.class);

    @FindBy(xpath = "//input[@value = 'Register']")
    WebElement Register2;

    @FindBy(name = "username")
    WebElement newuser;

    @FindBy(name = "password1")
    WebElement password1;

    @FindBy (name = "password2")
    WebElement password2;

    @FindBy(xpath = "// div[contains (text(), 'password_mismatch')]")
    WebElement mismatch;

    @FindBy(xpath = "// div[contains (text(), 'New Account Created.')]")
    WebElement AccCreSuc;

    public RegistrationPage_I(){
        PageFactory.initElements(driver,this);
    }
    public void allblank() {
        Register2.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Boolean isValidInput = (Boolean) js.executeScript("return arguments[0].checkValidity();",newuser);
        String validationusermsg = (String) js.executeScript("return arguments[0].validationMessage;",newuser);
        Assert.assertEquals(validationusermsg,"Please fill out this field.");
        logger.info("All Blank Scenario completed successfully");
    }
    public void passwordblank() {
        newuser.clear();
        newuser.sendKeys(username);
        Register2.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Boolean isValidInput = (Boolean) js.executeScript("return arguments[0].checkValidity();",password1);
        String validationusermsg = (String) js.executeScript("return arguments[0].validationMessage;",password1);
        Assert.assertEquals(validationusermsg,"Please fill out this field.");
        logger.info("Password Scenario blank completed successfully");
    }
    public void password2blank() {
        newuser.clear();
        password1.clear();
        newuser.sendKeys(username);
        password1.sendKeys(password);
        Register2.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Boolean isValidInput = (Boolean) js.executeScript("return arguments[0].checkValidity();",password2);
        String validationusermsg = (String) js.executeScript("return arguments[0].validationMessage;",password2);
        Assert.assertEquals(validationusermsg,"Please fill out this field.");
        logger.info("Confirm Password blank Scenario completed successfully");
    }

    public void invalidusernameformat() {
        newuser.clear();
        password1.clear();
        password2.clear();
        newuser.sendKeys(invalidpassword);
        password1.sendKeys(password);
        password2.sendKeys(password);
        Register2.click();
        Assert.assertEquals(mismatch.getText(),"password_mismatch:The two password fields didn’t match.");
        logger.info("Username mis-match scenario completed successfully");
    }
     public void Difpasswords() throws InterruptedException {
        newuser.sendKeys(username);
        password1.sendKeys(invalidpassword);
        password2.sendKeys(password);
        Register2.click();
        Thread.sleep(3000);
        Assert.assertEquals(mismatch.getText(),"password_mismatch:The two password fields didn’t match.");
         logger.info("Password mis-match scenario completed successfully");
     }
     public void UserPswd(){
         newuser.clear();
         password1.clear();
         password2.clear();
         newuser.sendKeys(username);
         password1.sendKeys(password);
         password2.sendKeys(password);
         Register2.click();
         Assert.assertEquals(AccCreSuc.getText(),"New Account Created. You are logged in as "+username);
         logger.info("New account created successfully");
     }
}
