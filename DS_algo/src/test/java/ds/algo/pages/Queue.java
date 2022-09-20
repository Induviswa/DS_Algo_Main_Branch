package ds.algo.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.testng.annotations.Test;

public class Queue {

	@FindBy(xpath="//a[@href='queue']")WebElement GetStarted;
	@FindBy(xpath="//h4[text()='Queue']")WebElement TabQueue;
	@FindBy(xpath="//a[text()='Implementation of Queue in Python']")WebElement ImplementationofQueueinPython;
	@FindBy(xpath="//p[text()='Implementation of Queue in Python']")WebElement TabImplementationofQueueinPython;
	@FindBy(xpath="//a[text()='Try here>>>']")
	public WebElement GetTryHere;
	@FindBy(xpath="//button[@type='button']")WebElement TabRun;
	@FindBy(xpath="//a[text()='Implementation using collections.deque']")WebElement Implementationusingcollectionsdeque;
	@FindBy(xpath="//p[text()='Implementation using collections.deque']")WebElement TabImplementationusingcollectionsdeque;
	
	@FindBy(xpath="//a[text()='Implementation using array']")WebElement Implementationusingarray;
	@FindBy(xpath="//p[text()='Implementation using array']")WebElement TabImplementationusingarray;
	
	@FindBy(xpath="//a[text()='Queue Operations']")WebElement QueueOperations;
	@FindBy(xpath="//p[text()='Queue Operations']")WebElement TabQueueOperations;
	
	@FindBy(xpath="//a[text()='Practice Questions']")WebElement PracticeQuestions;
  public void GetStartedQueue()
{
	GetStarted.click();
}

  public String GetTabQueue()
  {
	  return TabQueue.getText();
  }

  public void ClickImplementationofQueueinPython()
  {
	  ImplementationofQueueinPython.click();
  }
  
  public String GetImplementationofQueueinPython()
  {
	  return ImplementationofQueueinPython.getText();
  }
  
	public void ClickGetTryHere()
	
	{
		GetTryHere.click();
	}
	public String GetTabRun()
	{
		return TabRun.getText();
	}
	 public void ClickImplementationusingcollectionsdeque()
	  {
		 Implementationusingcollectionsdeque.click();
	  }
	  
	  public String GetImplementationusingcollectionsdeque()
	  {
		  return Implementationusingcollectionsdeque.getText();
	  }
	  
	  public void ClickImplementationusingarray()
	  {
		  Implementationusingarray.click();
	  }
	  
	  public String GetImplementationusingarray()
	  {
		  return Implementationusingarray.getText();
	  } 
	  
	  
	  public void ClickQueueOperations()
	  {
		  QueueOperations.click();
	  }
	  
	  public String GetQueueOperations()
	  {
		  return QueueOperations.getText();
	  }
	  public void ClickPracticeQuestions()
	  {
		  PracticeQuestions.click();
	  }
}