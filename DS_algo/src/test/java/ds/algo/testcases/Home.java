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
import ds.algo.pages.SignIn;
import ds.algo.pages.banner;
import ds.algo.pages.homepage;
import ds.algo.pages.registerpage;
import ds.algo.pages.welcomepage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Home {
	private static Logger loggerObj = LogManager.getLogger(TestRegister.class);
	WebDriver chromedriver;
	@BeforeSuite
	public void initDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surbh\\eclipse-workspace\\ds\\src\\test\\resources\\chromedriver.exe");
	    chromedriver=new ChromeDriver();
	    loggerObj.info("Running Before Suite");
	}
	@BeforeMethod
	public void OpenPortal() throws InterruptedException
	{
		chromedriver.get("https://dsportalapp.herokuapp.com/");
		welcomepage Obj =  PageFactory.initElements(chromedriver, welcomepage.class);
	    Obj.clickGetStarted();
	    loggerObj.info("Running Before Method");
	}
		 
	@Test
	public void TesthomeTitle() throws InterruptedException
	{
	    Thread.sleep(2000);
	    homepage HomeObj = PageFactory.initElements(chromedriver, homepage.class);
	    HomeObj.validateDataStructureTitle();
	    HomeObj.validateArrayTitle();
	    HomeObj.validateLinkedListTitle();
	    HomeObj.validateStackTitle();
	    HomeObj.validateQueueTitle();
	    HomeObj.validateTreeTitle();
	    HomeObj.validateGraphTitle();
	    loggerObj.info("Validating Home Page ");
	    chromedriver.close();
	    }
	@Test
	public void TestDropDown() throws InterruptedException
	{
	    
	    banner BannerObj = PageFactory.initElements(chromedriver, banner.class);
	    BannerObj.clickDataStructureDropDown();
	    BannerObj.validatingArray();
	    BannerObj.validatingStack();
	    BannerObj.validatingLinkedList();
	    BannerObj.validatingQueue();
	    BannerObj.validatingTree();
	    BannerObj.validatingGraph();
	    loggerObj.info("Validating Banner Title");
	  
	    }
	@Test
	public void TestClickDropDownArry() throws InterruptedException
	{
	    homepage HomeObj = PageFactory.initElements(chromedriver, homepage.class);
	    
	    banner BannerObj = PageFactory.initElements(chromedriver, banner.class);
	    BannerObj.clickDataStructureDropDown();
	    BannerObj.ClickArray();
	    HomeObj.ValidateMesg();
	    loggerObj.info("Checking DropDrown Button");
	}
	
	@Test
	public void TestDataStructureGetStarted() throws InterruptedException
	{ 
		homepage HomeObj = PageFactory.initElements(chromedriver, homepage.class);
	    HomeObj.clickDataStructureGetStarted();
	    HomeObj.ValidateMesg();
	    loggerObj.info("Clicking GetStarted Button");
	}
	
	@Test
	
	public void TestClickSignIn() throws InterruptedException
	{
        banner BannerObj = PageFactory.initElements(chromedriver, banner.class);
	    homepage HomeObj = PageFactory.initElements(chromedriver, homepage.class);
	    BannerObj.clickSignIn();
	    SignIn SignInObj = PageFactory.initElements(chromedriver,SignIn.class);
	    SignInObj.ValidateSignInPage();
	    loggerObj.info("Clicking SignIn");
	}
	
	@Test
	
	public void TestClickRegister() throws InterruptedException
	{
		banner BannerObj = PageFactory.initElements(chromedriver, banner.class);
		BannerObj.clickRegister();
		registerpage RegiObj = PageFactory.initElements(chromedriver,registerpage.class);
		RegiObj.ValidateRegister();
		loggerObj.info("Clicking Register");
	}

}
