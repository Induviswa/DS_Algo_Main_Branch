package ds.algo.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Tree {
	
	@FindBy(xpath="//a[@href='tree']")WebElement GetStarted;
	@FindBy(xpath="//a[@href='overview-of-trees']")WebElement GetOverview;
	@FindBy(xpath="//a[text()='Try here>>>']")
	public WebElement GetTryHere;
	@FindBy(xpath="//h4[@class='bg-secondary text-white']")WebElement TitleTreePage;
	@FindBy(xpath="//a[text()='Overview of Trees']")WebElement TitleOverviewTree;
	@FindBy(xpath="//button[@type='button']")WebElement TabRun;
	@FindBy(xpath="//a[text()='Terminologies']")WebElement Terminologies;
	@FindBy(xpath="//a[text()='Types of Trees']")WebElement TypesofTrees;
	@FindBy(xpath="//p[text()='Types of Trees']")WebElement TabTypesofTrees;
	@FindBy(xpath="//a[text()='Tree Traversals']")WebElement TreeTraversals;
	@FindBy(xpath="//p[text()='Tree Traversals']")WebElement TabTreeTraversals;
	
	@FindBy(xpath="//a[text()='Traversals-Illustration']")WebElement TraversalsIllustration;
	@FindBy(xpath="//p[text()='Traversals-Illustration']")WebElement TabTraversalsIllustration;
	
	@FindBy(xpath="//a[text()='Binary Trees']")WebElement BinaryTrees;
	@FindBy(xpath="//p[text()='Binary Trees']")WebElement TabBinaryTrees;
	
	@FindBy(xpath="//a[text()='Types of Binary Trees']")WebElement TypesofBinaryTrees;
	@FindBy(xpath="//strong[text()='Complete Binary tree']")WebElement CompleteBinarytree;
	
	@FindBy(xpath="//a[text()='Implementation in Python']")WebElement ImplementationinPython;
	@FindBy(xpath="//p[text()='Implementation in Python']")WebElement TabImplementationinPython;
	
	@FindBy(xpath="//a[text()='Binary Tree Traversals']")WebElement BinaryTreeTraversals;
	@FindBy(xpath="//p[text()='Binary Tree Traversals']")WebElement TabBinaryTreeTraversals;
	
	@FindBy(xpath="//a[text()='Implementation of Binary Trees']")WebElement ImplementationofBinaryTrees;
	@FindBy(xpath="//p[text()='Implementation of Binary Trees']")WebElement TabImplementationofBinaryTrees;
	
	@FindBy(xpath="//a[text()='Applications of Binary trees']")WebElement ApplicationsofBinarytrees;
	@FindBy(xpath="//p[text()='Applications of Binary trees']")WebElement TabApplicationsofBinarytrees;
	
	@FindBy(xpath="//a[text()='Binary Search Trees']")WebElement BinarySearchTrees;
	@FindBy(xpath="//p[text()='Binary Search Trees']")WebElement TabBinarySearchTrees;
	
	@FindBy(xpath="//a[text()='Implementation Of BST']")WebElement ImplementationOfBST;
	@FindBy(xpath="//p[text()='Implementation Of BST']")WebElement TabImplementationOfBST;
	
	@FindBy(xpath="//a[text()='Practice Questions']")WebElement PracticeQuestions;
	@FindBy(xpath="//a[text()='Practice Questions']")WebElement TabPracticeQuestions;
	
	@FindBy(xpath="//p[text()='Terminologies']")WebElement TabTerminologies;
	public void ClickGetStarted()
	{
		GetStarted.click();
	}
	
	public void clickOverviewOfTree() 
	{
		GetOverview.click();
	}
    
	public void ClickGetTryHere()
	{
		GetTryHere.click();
	}
	public String GetTitleTreePage()
	{
		return TitleTreePage.getText();
	}
	public String GetOverviewTreeTab()
	{
		return TitleOverviewTree.getText();
	}
	public String GetTabRun()
	{
		return TabRun.getText();
	}
	public void ClickTerminologies()
	{
		Terminologies.click();
	}
	public String GetTabTerminologies()
	{
		return TabTerminologies.getText();
	}
	public void ClickTypesOfTree()
	{
		TypesofTrees.click();
	}
	public String GetTabTypesofTrees()
	{
		return TabTypesofTrees.getText();
	}
	public void ClickTreeTraversals()
	{
		TreeTraversals.click();
	}
	public String GetTabTreeTraversals()
	{
		return TabTreeTraversals.getText();
	}
	public void ClickTraversalsIllustration()
	{
		TraversalsIllustration.click();
	}
	public String GetTabTraversalsIllustration()
	{
		return TabTraversalsIllustration.getText();
	}
	public void ClickBinaryTrees()
	{
		BinaryTrees.click();
	}
	public String GetTabBinaryTrees()
	{
		return TabBinaryTrees.getText();
	}
	
	public void ClickTypesOfBinaryTrees()
	{
		TypesofBinaryTrees.click();
	}
	public String GetCompleteBinarytree()
	{
		return CompleteBinarytree.getText();
	}
	
	public void ClickImplementationinPython()
	{
		ImplementationinPython.click();
	}
	public String GetTabImplementationinPython()
	{
		return TabImplementationinPython.getText();
	}
	public void ClickBinaryTreeTraversals()
	{
		BinaryTreeTraversals.click();
	}
	public String GetTabBinaryTreeTraversals()
	{
		return TabBinaryTreeTraversals.getText();
	}
	public void ClickImplementationofBinaryTrees()
	{
		ImplementationofBinaryTrees.click();
	}
	public String GetTabImplementationofBinaryTrees()
	{
		return TabImplementationofBinaryTrees.getText();
	}
	
	
	public void ClickBinarySearchTrees()
	{
		BinarySearchTrees.click();
	}
	public String GetTabBinarySearchTrees()
	{
		return TabBinarySearchTrees.getText();
	}
	
	
	public void ClickApplicationsofBinarytrees()
	{
		ApplicationsofBinarytrees.click();
	}
	public String GetTabApplicationsofBinarytrees()
	{
		return TabApplicationsofBinarytrees.getText();
	}
	
	
	
	public void ClickImplementationOfBST()
	{
		ImplementationOfBST.click();
	}
	public String GetTabImplementationOfBST()
	{
		return TabImplementationOfBST.getText();
	}
	
	public void ClickPracticeQuestions()
	{
		PracticeQuestions.click();
	}
	
	
}



