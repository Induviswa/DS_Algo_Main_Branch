package DS_Pages;

import BaseUtils.BrowserConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SigninPage_I extends BrowserConfig {
    private static Logger logger = LogManager.getLogger(SigninPage_I.class);
    @FindBy(name = "username")
    WebElement newuser;

    @FindBy(name = "password")
    WebElement Password;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement Login;

    @FindBy(xpath = " //div[contains(text(), 'Invalid Username and Password')]")
    WebElement WrgUserPass;

    @FindBy(xpath = " //div[contains(text(), ' You are logged in')]")
    WebElement LogSuc;

    @FindBy(xpath = " //a[contains(text(), 'Sign out')]//preceding-sibling::a[1] ")
    WebElement RightUserPass;

    @FindBy(xpath = " //a[@href='/logout']")
    WebElement Logout;

    @FindBy(xpath = " //div[contains(text(), 'Logged out successfully')]")
    WebElement SignOutMsg;

    //String Username = "MidHigh";


    public SigninPage_I(){
        PageFactory.initElements(driver,this);

    }
    // No deatils of password and username and click
    public void NoDetails(){
        newuser.clear();
        Password.clear();
        Login.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Boolean isValidInput = (Boolean) js.executeScript("return arguments[0].checkValidity();",newuser);
        String validationusermsg = (String) js.executeScript("return arguments[0].validationMessage;",newuser);
        Assert.assertEquals( validationusermsg,"Please fill out this field.");
        logger.info("Blank username and password validation successful");
    }
    public void PassUserName(){
        newuser.sendKeys(invalidusername);
        Login.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Boolean isValidInput = (Boolean) js.executeScript("return arguments[0].checkValidity();",Password);
        String validationusermsg = (String) js.executeScript("return arguments[0].validationMessage;",Password);
        Assert.assertEquals( validationusermsg,"Please fill out this field.");
        logger.info("Blank password validation successful");
    }
    public void PassPswd(){
        newuser.clear();
        Password.clear();
        Password.sendKeys(invalidpassword);
        Login.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Boolean isValidInput = (Boolean) js.executeScript("return arguments[0].checkValidity();",newuser);
        String validationusermsg = (String) js.executeScript("return arguments[0].validationMessage;",newuser);
        Assert.assertEquals( validationusermsg,"Please fill out this field.");
        logger.info("Blank username validation successful");
    }

    public void InVaUserPawd(){
        newuser.clear();
        Password.clear();
        newuser.sendKeys(invalidusername);
        Password.sendKeys(invalidpassword);
        Login.click();
        Assert.assertEquals(WrgUserPass.getText(),"Invalid Username and Passwordd");
        logger.info("invalid username and password validation successful");
    }
    public void ValUserPswd(){
        newuser.clear();
        Password.clear();
        System.out.println("Get Test Data");
        newuser.sendKeys(username);
        Password.sendKeys(password);
        Login.click();
        Assert.assertEquals(LogSuc.getText(),"You are logged in");
        Assert.assertEquals(RightUserPass.getText(),username);
        logger.info("Valid credentials successful");
    }
    public void SigOut(){
            Logout.click();
            Assert.assertEquals(SignOutMsg.getText(),"Logged out successfully");
            System.out.println(SignOutMsg.getText());
            logger.info("Sign out successfull");
    }
}
