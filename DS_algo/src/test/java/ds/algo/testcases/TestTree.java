package ds.algo.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ds.algo.pages.SignIn;
import ds.algo.pages.Tree;
import ds.algo.pages.banner;
import ds.algo.pages.welcomepage;
import utility.Screenshot;
import java.io.IOException;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class TestTree {
	WebDriver chromedriver;
	Tree TreeObj;
	private static Logger loggerObj = LogManager.getLogger(TestRegister.class);
	@BeforeSuite
	
	public void Driver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surbh\\eclipse-workspace\\ds\\src\\test\\resources\\chromedriver.exe");
	    chromedriver=new ChromeDriver();
	    TreeObj = PageFactory.initElements(chromedriver,Tree.class);
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
	    loggerObj.info("BeforeClass Executing");
}
	@AfterMethod
	public void takeScreenshotOnFailure(ITestResult testResult) throws IOException
	{if(testResult.getStatus()== ITestResult.FAILURE) {
		String Filename = "data\\screenshots\\"+testResult.getName()+"-"
				+Arrays.toString(testResult.getParameters())+".png";
		Screenshot scr = new Screenshot();
		scr.CaptureScreenShot(chromedriver, Filename);
	   }	
		}
     @AfterTest
		public void ClosePortal() 
		{
			chromedriver.close();
			}

	@Test
	public void TestTreeStarted()
	{
		TreeObj.ClickGetStarted();
		Assert.assertEquals(TreeObj.GetTitleTreePage(), "Tree");
		loggerObj.info("Tree Get Started Succesfully");
	}
	@Test
	
	public void TestOverview()
	{
		TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		Assert.assertEquals(TreeObj.GetOverviewTreeTab(),"Overview of Trees");
		loggerObj.info("Succesfully open Overview of Trees");
	}
@Test
    public void TestClickGetTryHere() throws InterruptedException
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		Thread.sleep(1000);
    	TreeObj.ClickGetTryHere();
    	loggerObj.info("Succesfully open OverviewOfTreeTryHere");
    }
    @Test
    public void TestGetTabRun()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
    	TreeObj.ClickGetTryHere();
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    	loggerObj.info("Clicking Run Tab ");
    }
    @Test
    public void TestTerminologies()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
    	TreeObj.ClickTerminologies();
    	Assert.assertEquals(TreeObj.GetTabTerminologies(), "Terminologies");
    	loggerObj.info("Succesfully open Test Terminologies");
    }
    @Test
    public void TestTerminologiesTryHere()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
    	TreeObj.ClickTerminologies();
    	TreeObj.ClickGetTryHere();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    }
    @Test
    public void TestTypesOfTree()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
    	TreeObj.ClickTypesOfTree();
    	Assert.assertEquals(TreeObj.GetTabTypesofTrees(),"Types of Trees");
    	loggerObj.info("Succesfully open TypesOfTree");
    }
    
    @Test
    public void TestTypesOfTreeTryHere()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
    	TreeObj.ClickTypesOfTree();
    	TreeObj.ClickGetTryHere();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    	
    }
    @Test
    public void TestTraversal()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickTreeTraversals();
		Assert.assertEquals(TreeObj.GetTabTreeTraversals(),"Tree Traversals");
		loggerObj.info("Succesfully open Traversal");
    
}
    @Test
    public void TestTraversalTryHere()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickTreeTraversals();
		TreeObj.ClickGetTryHere();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    
}
    @Test
    public void TestTraversalsIllustration()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickTraversalsIllustration();
		Assert.assertEquals(TreeObj.GetTabTraversalsIllustration(),"Traversals-Illustration");
		loggerObj.info("Succesfully open TraversalsIllustration");
    
}
    @Test
    public void TestTraversalsIllustrationTryHere()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickTraversalsIllustration();
		TreeObj.ClickGetTryHere();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    }
    
    @Test
    public void TestBinaryTrees()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickBinaryTrees();
		Assert.assertEquals(TreeObj.GetTabBinaryTrees(),"Binary Trees");
		loggerObj.info("Succesfully open  TestBinaryTrees");
}
    @Test
    public void TestBinaryTreesTryHere()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickBinaryTrees();
		TreeObj.ClickGetTryHere();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    }
    
    @Test
    public void TestTypesOfBinaryTrees()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickTypesOfBinaryTrees();
		Assert.assertEquals(TreeObj.GetCompleteBinarytree(),"Complete Binary tree");
		loggerObj.info("Succesfully open TypesOfBinaryTrees");
}
    @Test
    public void TestTypesOfBinaryTreesTryHere()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickTypesOfBinaryTrees();
		TreeObj.ClickGetTryHere();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    }
    
    @Test
    public void TestImplementationinPython()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickImplementationinPython();
		Assert.assertEquals(TreeObj.GetTabImplementationinPython(),"Implementation in Python");
		loggerObj.info("Succesfully open ImplementationinPython");
}
    @Test
    public void TestImplementationinPythonTryHere()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickImplementationinPython();
		TreeObj.ClickGetTryHere();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    	loggerObj.info("Clicking ImplementationinPythonTryHere");
    }
    
    @Test
    public void TestBinaryTreeTraversals()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickBinaryTreeTraversals();
		Assert.assertEquals(TreeObj.GetTabBinaryTreeTraversals(),"Binary Tree Traversals");
		loggerObj.info("Succesfully open BinaryTreeTraversals");
    }
    
    @Test
    public void TestBinaryTreeTraversalsTryHere()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickBinaryTreeTraversals();
		TreeObj.ClickGetTryHere();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    }
    
    @Test
    public void TestImplementationofBinaryTrees()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickImplementationofBinaryTrees();
		Assert.assertEquals(TreeObj.GetTabImplementationofBinaryTrees(),"Implementation of Binary Trees");
		loggerObj.info("Succesfully open ImplementationofBinaryTrees");
    } 
    @Test
    public void TestImplementationofBinaryTreesTryHere()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickImplementationofBinaryTrees();
		TreeObj.ClickGetTryHere();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    	loggerObj.info("Clicking ImplementationofBinaryTreesTryHere");
    }
    
    @Test
    public void TestApplicationsofBinarytrees()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickApplicationsofBinarytrees();
		Assert.assertEquals(TreeObj.GetTabApplicationsofBinarytrees(),"Applications of Binary trees");
		loggerObj.info("Succesfully open ApplicationsofBinarytrees");
    }
    
    @Test
    public void TestApplicationsofBinarytreesTryHere()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickApplicationsofBinarytrees();
		TreeObj.ClickGetTryHere();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    }
    
    @Test
    public void TestBinarySearchTrees()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickBinarySearchTrees();
		Assert.assertEquals(TreeObj.GetTabBinarySearchTrees(),"Binary Search Trees");
		loggerObj.info("Succesfully open BinarySearchTrees");
    } 
    
    @Test
    public void TestBinarySearchTreesTryHere()
    {   
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickBinarySearchTrees();
		TreeObj.ClickGetTryHere();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    }
    
    @Test
    public void TestImplementationOfBST()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickImplementationOfBST();
		Assert.assertEquals(TreeObj.GetTabImplementationOfBST(),"Implementation Of BST");
		loggerObj.info("Succesfully open ImplementationOfBST");
    } 
    @Test
    public void TestImplementationOfBSTTryHere()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickImplementationOfBST();
		TreeObj.ClickGetTryHere();
    	Assert.assertNotNull(TreeObj.GetTryHere);
    	Assert.assertEquals(TreeObj.GetTabRun(),"Run");
    	loggerObj.info("Clicking ImplementationOfBSTTryHere");
    }
    
    @Test
    public void TestPracticeQuestions()
    {
    	TreeObj.ClickGetStarted();
		TreeObj.clickOverviewOfTree();
		TreeObj.ClickPracticeQuestions();
		loggerObj.info("Succesfully open PracticeQuestions");
    } 
}
