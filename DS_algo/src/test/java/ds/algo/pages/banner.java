package ds.algo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class banner {
	
	@FindBy(className="navbar-brand")WebElement NumpyNinja;

	@FindBy(xpath="//a[text()=' Register ']")WebElement Register;
	@FindBy(xpath="//a[text()='Sign in']")WebElement SignIn;
	@FindBy(xpath="//div[@class='nav-item dropdown']")WebElement DataStructureDropDown;
	@FindBy(xpath= "//a[text()='Arrays']")WebElement ArraysDropdrown;
	@FindBy(xpath="//a[text()='Linked List']")WebElement LinkedListDropdrown;
	@FindBy(xpath="//a[text()='Stack']")WebElement StackDropdrown;
	@FindBy(xpath="//a[text()='Queue']")WebElement QueueDropdrown;
	@FindBy(xpath="//a[text()='Tree']")WebElement TreeDropdrown;
	@FindBy(xpath="//a[text()='Graph']")WebElement GraphDropdrown;
	@FindBy(xpath="//a[@href='/logout']")WebElement signOut;
	
	public void validatingNumpyNinja()
	{
		Assert.assertNotNull(NumpyNinja);
	}
	
	public void clickRegister() {
		Register.click();
	}
	
	public void clickSignIn()
	{
		SignIn.click();
	}
	
	public void clickSignOut() {
		signOut.click();
	}
	
	public void clickDataStructureDropDown()
	{
		DataStructureDropDown.click();
	}
	public void validatingArray()
	{
		Assert.assertNotNull(ArraysDropdrown);
	}
	public void validatingLinkedList()
	{
		Assert.assertNotNull(LinkedListDropdrown);
	}
	public void validatingStack()
	{
		Assert.assertNotNull(StackDropdrown);
	}
	public void validatingQueue()
	{
		Assert.assertNotNull(QueueDropdrown);
	}
	public void validatingTree()
	{
		Assert.assertNotNull(TreeDropdrown);
	}
	public void validatingGraph()
	{
		Assert.assertNotNull(GraphDropdrown);
	}
	
	public void ClickArray()
	{
		ArraysDropdrown.click();
	}
	public void ClickLinkedList()
	{
		LinkedListDropdrown.click();
	}
	public void Stack()
	{
		StackDropdrown.click();
	}
	public void ClickQueue()
	{
		QueueDropdrown.click();
	}
	public void ClickTree()
	{
		TreeDropdrown.click();
	}
	public void ClickGraph()
	{
		GraphDropdrown.click();
	}
}
	
