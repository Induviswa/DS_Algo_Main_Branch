package ds.algo.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class homepage {
	
	@FindBy(xpath="//h5[text()='Data Structures-Introduction']")WebElement DataStructureTitle;
	@FindBy(xpath="//h5[text()='Array']")WebElement ArrayTitle;
	@FindBy(xpath="//h5[text()='Linked List']")WebElement LinkedListTitle;
	@FindBy(xpath="//h5[text()='Stack']")WebElement StackTitle;
	@FindBy(xpath="//h5[text()='Queue']")WebElement QueueTitle;
	@FindBy(xpath="//h5[text()='Tree']")WebElement TreeTitle;
	@FindBy(xpath="//h5[text()='Graph']")WebElement GraphTitle;
	
	@FindBy(xpath="//h5[text()='Data Structures-Introduction']/../a")WebElement DataStructureGetStarted;
	@FindBy(xpath="//h5[text()='Array']/../a")WebElement ArrayGetStarted;
	@FindBy(xpath="//h5[text()='Linked List']/../a']/../a")WebElement LinkedListGetStarted;
	@FindBy(xpath="//h5[text()='Stack']/../a")WebElement StackGetStarted;
	@FindBy(xpath="//h5[text()='Queue']/../a")WebElement QueueGetStarted;
	@FindBy(xpath="//h5[text()='Tree']/../a")WebElement TreeGetStarted;
	@FindBy(xpath="//h5[text()='Graph']/../a")WebElement GraphGetStarted;
	
	@FindBy(xpath="//div[contains(text(),'You are not logged in')]")WebElement Mesg;
	

	public void validateDataStructureTitle()
	{
		Assert.assertNotNull(DataStructureTitle);
	}
	public void validateArrayTitle()
	{
		Assert.assertNotNull(ArrayTitle);
	}
	public void validateLinkedListTitle()
	{
		Assert.assertNotNull(LinkedListTitle);
	}
	public void validateStackTitle()
	{
		Assert.assertNotNull(StackTitle);
	}
	public void validateQueueTitle()
	{
		Assert.assertNotNull(QueueTitle);
	}
	public void validateTreeTitle()
	{
		Assert.assertNotNull(TreeTitle);
	}
	public void validateGraphTitle()
	{
		Assert.assertNotNull(GraphTitle);
	}
	public void clickDataStructureGetStarted()
	{
		DataStructureGetStarted.click();
	}
	public void clickArrayGetStarted()
	{
		ArrayGetStarted.click();	
	}
	public void clickLinkedListGetStarted()
	{
		LinkedListGetStarted.click();
		
	}
	public void clickStackGetStarted()
	{
		StackGetStarted.click();
		
	}
	public void clickQueueGetStarted() 
	{
		QueueGetStarted.click();
	}
	public void clickTreeGetStarted() 
	{
		TreeGetStarted.click();
	}
	
	public void clickGraphGetStarted()
	{
		GraphGetStarted.click();
	
     }
	public void ValidateMesg()
	{
		Assert.assertNotNull(Mesg);
	}
}