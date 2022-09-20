package DS_Pages;

import BaseUtils.BrowserConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PortalPage_I extends BrowserConfig {
  private static Logger logger = LogManager.getLogger(PortalPage_I.class);

    // Xpath
    @FindBy(xpath = "//h1[contains(text(),'Preparing for the Interviews')]")
    WebElement homepagetitle;

    @FindBy(className = "btn")
    WebElement startbtn;

    //Initialize page object with page factory method
    public PortalPage_I() {
        PageFactory.initElements(driver, this);
    }

    //Funtionalities in portal page
    public void portalpage() {
        String portalpagetitle = driver.getTitle();
        Assert.assertEquals(portalpagetitle, "Numpy Ninja");
        logger.info("Portal Page validation successfull");
    }

    public void btngetstartedclick(){
        startbtn.click();
        System.out.println("Get Started Button clicked successfully");
        logger.info("Get Started Button clicked successfully");
    }

    public void validatehomepage(){
    String homepagetitle = driver.getTitle();
    Assert.assertEquals(homepagetitle,"NumpyNinja");
    logger.info("Validate Home Page Title");
    logger.info("Portal page validation successfull");
    }
}
