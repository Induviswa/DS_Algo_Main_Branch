package ds.algo.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ds.algo.pages.Queue;
import ds.algo.pages.SignIn;
import ds.algo.pages.Tree;
import ds.algo.pages.banner;
import ds.algo.pages.welcomepage;
import utility.Screenshot;
import java.io.IOException;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class TestQueue {
	WebDriver chromedriver;
	Queue QueueObj;
	private static Logger loggerObj = LogManager.getLogger(TestRegister.class);
	@BeforeSuite
	
	public void Driver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surbh\\eclipse-workspace\\ds\\src\\test\\resources\\chromedriver.exe");
	    chromedriver=new ChromeDriver();
	    QueueObj = PageFactory.initElements(chromedriver,Queue.class);
	    loggerObj.info("Before Suite of Class TestQueue Executing");
	}
	
	@BeforeClass
	
	public void SucessLogin() throws InterruptedException
	{
		chromedriver.get("https://dsportalapp.herokuapp.com/");
		welcomepage Obj =  PageFactory.initElements(chromedriver, welcomepage.class);
	    Obj.clickGetStarted();
	    banner BannerObj = PageFactory.initElements(chromedriver, banner.class);
	    BannerObj.clickSignIn();
		SignIn SignInObj = PageFactory.initElements(chromedriver,SignIn.class);
		SignInObj.EnterUserName("Surbhi1211");
		SignInObj.EnterPassword("Dongle1211");
		SignInObj.ClickLogin();
		loggerObj.info("BeforeClass Executing");
}
	
	@BeforeMethod
	
	public void OpenPortal() throws InterruptedException
	{
		chromedriver.get("https://dsportalapp.herokuapp.com/");
		welcomepage Obj =  PageFactory.initElements(chromedriver, welcomepage.class);
	    Obj.clickGetStarted();
	    loggerObj.info("Before Method Executing");
}
	
	@AfterMethod 
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException { 
		if (testResult.getStatus() == ITestResult.FAILURE) { 
			String FileName = "data\\screenshots\\" + testResult.getName() + "-" 
					+ Arrays.toString(testResult.getParameters()) +  ".png";
			Screenshot scr = new Screenshot();
			scr.CaptureScreenShot(chromedriver, FileName);
			
		} 
	}
	
	//@AfterTest
		public void ClosePortal() 
		{
			chromedriver.close();
		}
		@Test
		public void TestStarted()
		{
			QueueObj.GetStartedQueue();
			Assert.assertEquals(QueueObj.GetTabQueue(), "Queue");
			loggerObj.info("Queue Get Started");
		}
		@Test
		public void TestImplementationofQueueinPython()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickImplementationofQueueinPython();
			Assert.assertEquals(QueueObj.GetImplementationofQueueinPython(), "Implementation of Queue in Python");
			loggerObj.info("Clicking ImplementationofQueueinPython");
		}
		@Test
		public void TestImplementationofQueueinPythonTryHere()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickImplementationofQueueinPython();
			QueueObj.ClickGetTryHere();
			Assert.assertEquals(QueueObj.GetTabRun(),"Run");
			loggerObj.info("Clicking ImplementationofQueueinPythonTryHere");
		}
		
		@Test
		public void TestImplementationusingcollectionsdeque()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickImplementationusingcollectionsdeque();
			Assert.assertEquals(QueueObj.GetImplementationusingcollectionsdeque(), "Implementation using collections.deque");
			loggerObj.info("Clicking Implementationusingcollectionsdeque");
		}
		@Test
		public void TestImplementationusingcollectionsdequeFailed()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickImplementationusingcollectionsdeque();
			Assert.assertEquals(QueueObj.GetImplementationusingcollectionsdeque(), "Implementation using collections.deque  Art");
			loggerObj.info("Failed to find Implementation using collections.deque  Art");
		}
		@Test
		public void TestImplementationusingcollectionsdequeTryHere()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickImplementationusingcollectionsdeque();
			QueueObj.ClickGetTryHere();
			Assert.assertEquals(QueueObj.GetTabRun(),"Run");
			loggerObj.info("Clicking ImplementationusingcollectionsdequeTryHere");
		}
		@Test
		public void TestImplementationusingarray()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickImplementationusingarray();
			Assert.assertEquals(QueueObj.GetImplementationusingarray(), "Implementation using array");
			loggerObj.info("Clicking Implementationusingarray");
		}
		
		@Test
		public void TestImplementationusingarrayTryHere()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickImplementationusingarray();
			QueueObj.ClickGetTryHere();
			Assert.assertEquals(QueueObj.GetTabRun(),"Run");
			loggerObj.info("ClickingUser ImplementationusingarrayTryHere");
		}
		@Test
		public void TestQueueOperations()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickQueueOperations();
			Assert.assertEquals(QueueObj.GetQueueOperations(), "Queue Operations");
			loggerObj.info("Clicking QueueOperations");
		}
		@Test
		public void TestQueueOperationsFailed()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickQueueOperations();
			Assert.assertEquals(QueueObj.GetQueueOperations(), "Queue Operations sucess");
			loggerObj.info("Failed to find Queue Operations sucess");
		}
		@Test
		public void TestQueueOperationsTryHere()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickQueueOperations();
			QueueObj.ClickGetTryHere();
			Assert.assertEquals(QueueObj.GetTabRun(),"Run");
			loggerObj.info("Clicking QueueOperationsTryHere");
		}
		@Test
		public void TestPracticeQuestions()
		{
			QueueObj.GetStartedQueue();
			QueueObj.ClickQueueOperations();
			QueueObj.ClickPracticeQuestions();
			loggerObj.info("Clicking TestPracticeQuestions");
		}
		
}
