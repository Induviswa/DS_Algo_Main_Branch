package ds.algo.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ds.algo.pages.welcomepage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DsAlgoPortal {
	private static Logger loggerObj = LogManager.getLogger(TestRegister.class);
	@Test
	public void TestOpenPortal() throws InterruptedException 
	{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\surbh\\eclipse-workspace\\ds\\src\\test\\resources\\chromedriver.exe");
    WebDriver chromedriver = new ChromeDriver();
    chromedriver.get("https://dsportalapp.herokuapp.com/");
    
    //welcomepage WelcomepageObj = new welcomepage();
    welcomepage WelcomepageObj =  PageFactory.initElements(chromedriver, welcomepage.class);
    WelcomepageObj.clickGetStarted();
    WelcomepageObj.validateGetStarted();
    WelcomepageObj.validateheading1();
    WelcomepageObj.validateheading2();
	loggerObj.info("User Succesfully open the Welcome Page");
    chromedriver.close();
	}
	
	@Test
	public void TestGetStarted() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\surbh\\eclipse-workspace\\ds\\src\\test\\resources\\chromedriver.exe");
	WebDriver chromedriver = new ChromeDriver();
	welcomepage PageObj =  PageFactory.initElements(chromedriver, welcomepage.class);
	chromedriver.get("https://dsportalapp.herokuapp.com/");
	//welcomepage PageObj = new welcomepage();
	loggerObj.info("User Succesfully Click on Get started");
	PageObj.clickGetStarted();
	
	}
}
