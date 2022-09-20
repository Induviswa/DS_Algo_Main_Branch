package ds.algo.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ds.algo.pages.SignIn;
import ds.algo.pages.banner;
import ds.algo.pages.welcomepage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSignIN {
	private static Logger loggerObj = LogManager.getLogger(TestRegister.class);
	WebDriver chromedriver;
	@BeforeSuite
	
	public void Driver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surbh\\eclipse-workspace\\ds\\src\\test\\resources\\chromedriver.exe");
	    chromedriver=new ChromeDriver();
	}
	@BeforeMethod
	 public void OpenPortal() throws InterruptedException
		{
			chromedriver.get("https://dsportalapp.herokuapp.com/");
			welcomepage Obj =  PageFactory.initElements(chromedriver, welcomepage.class);
		    Obj.clickGetStarted();
		    banner BannerObj = PageFactory.initElements(chromedriver, banner.class);
		    BannerObj.clickSignIn();
			
		}
	@Test
	public void AllfieldEmpty()
	{
		SignIn SignInObj = PageFactory.initElements(chromedriver,SignIn.class);
		SignInObj.ClickLogin();
		JavascriptExecutor js = (JavascriptExecutor) chromedriver;
		Boolean isValidInput =(Boolean)js.executeScript("return arguments[0].checkValidity();",SignInObj.UserName);
		String validationMessage = (String)js.executeScript("return arguments[0].validationMessage;",SignInObj.UserName);
	}
	
	@Test
	public void PasswrdEmpty()
	{
		SignIn SignInObj = PageFactory.initElements(chromedriver,SignIn.class);
		SignInObj.EnterUserName("sur");
		SignInObj.ClickLogin();
		JavascriptExecutor js = (JavascriptExecutor) chromedriver;
		Boolean isValidInput =(Boolean)js.executeScript("return arguments[0].checkValidity();",SignInObj.Password);
		String validationMessage = (String)js.executeScript("return arguments[0].validationMessage;",SignInObj.Password);
		
	}
	@Test
	public void EmptyUserPwd()
	{
		SignIn SignInObj = PageFactory.initElements(chromedriver,SignIn.class);
		SignInObj.EnterUserName("sur");
		SignInObj.ClickLogin();
	
		
	}
	@Test
	public void InvalidUserPwd()
	{
		SignIn SignInObj = PageFactory.initElements(chromedriver,SignIn.class);
		SignInObj.EnterUserName("Surbhi12");
		SignInObj.EnterPassword("234");
		SignInObj.ClickLogin();
		SignInObj.ShowInvalidUserPwd();
	}
	@Test
	public void InvalidUserName()
	{
		SignIn SignInObj = PageFactory.initElements(chromedriver,SignIn.class);
		SignInObj.EnterUserName("S12");
		SignInObj.EnterPassword("Dongle12");
		SignInObj.ClickLogin();
		SignInObj.ShowInvalidUserPwd();
	}
	@Test
	public void SucessLogin()
	{
		SignIn SignInObj = PageFactory.initElements(chromedriver,SignIn.class);
		SignInObj.EnterUserName("Surbhi1211");
		SignInObj.EnterPassword("Dongle1211");
		SignInObj.ClickLogin();
		String mesg=SignInObj.ShowSucessMesg();
		System.out.println(mesg);
		Assert.assertEquals(mesg,"You are logged in");

		String ActualUserName= SignInObj.GetUserName();
		Assert.assertEquals(ActualUserName,"Surbhi1211");
	}
	
	
}
