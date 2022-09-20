package ds.algo.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class registerpage {
	@FindBy(id="id_username")
	public WebElement UserName;
	@FindBy(id="id_password1") public WebElement Password;
	@FindBy(id="id_password2") public WebElement PasswordConfirm;
	@FindBy(xpath="//input[@value='Register']")WebElement Register;
	@FindBy(xpath="//a[text()='Login ']")WebElement Login;
	@FindBy(xpath="//div[contains(text(),'password_mismatch:The two password fields didn’t match.')]")public WebElement errormessage;
	@FindBy(xpath="//div[contains(text(),' New Account Created.')]")public WebElement SuccessMesg;
	public void ValidateRegister()
	{
		Assert.assertNotNull(UserName);
		
	}
	public void SetUserName(String username)
	{
		UserName.sendKeys(username);
	}
	
	public void SetPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void SetPasswordConfirm(String password)
	{
		PasswordConfirm.sendKeys(password);
	}
	
	public void ClickRegisterButton()
	{
		Register.click();
    }
	public void ClickLoginButton()
	{
		Login.click();
    }
	public String geterrormessage()
	{
		return errormessage.getText();
	}
	public String GetSuccessMesg()
	{
		return SuccessMesg.getText();
	}
}
