package ds.algo.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignIn {
	
	@FindBy(id="id_username")public WebElement UserName;
	@FindBy(id="id_password")public WebElement Password;
	@FindBy(xpath="//input[@value='Login']")WebElement Login;
	@FindBy(xpath="//a[text()='Register!']")WebElement Register;
	@FindBy(xpath="//div[contains(text(),' Invalid')]")WebElement InvalidNamePwd;
	@FindBy(xpath="//div[contains(text(),' You are logged in')]")public WebElement SucessMesg;
	@FindBy(xpath="//a[@href='/logout']/../a[2]")public WebElement SucessUesrName;
	
	public void ValidateSignInPage()
	{
		Assert.assertNotNull(UserName);
	}
	public void EnterUserName(String username)
	{
		UserName.sendKeys(username);
	}
	
	public void EnterPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void ClickLogin()
	{
		Login.click();
	}
	
	public void ClickRegister()
	{
		Register.click();
	}
	public void ShowInvalidUserPwd()
	{
		InvalidNamePwd.getText();
	}
	public String ShowSucessMesg()
	{
		return SucessMesg.getText();
	}
	public String GetUserName()
	{
		return SucessUesrName.getText();
	}
}
