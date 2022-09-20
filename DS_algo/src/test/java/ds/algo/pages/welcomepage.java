package ds.algo.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class welcomepage {
	
	@FindBy(xpath="//h1[text()='Preparing for the Interviews']") WebElement heading1;
	@FindBy(xpath="//p[text()='You are at the right place']") WebElement heading2;
	@FindBy(xpath="//button[text()='Get Started']") WebElement button;
	
	public void validateheading1() {
		Assert.assertNotNull(heading1);
		
	}
	public void validateheading2() {
		Assert.assertNotNull(heading2);
	}
	public void validateGetStarted() {
		Assert.assertNotNull(button);
	}
	public void clickGetStarted() throws InterruptedException {
		Thread.sleep(3000);
		button.click();
	}

}
