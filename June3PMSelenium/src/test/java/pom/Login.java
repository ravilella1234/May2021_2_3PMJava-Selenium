package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	@FindBy(linkText="Sign in")public WebElement signIn;
	@FindBy(id="email")public WebElement customerEmail;
	@FindBy(id="passwd")public WebElement customerPassword;
	@FindBy(xpath="//button[@id='SubmitLogin']")public WebElement submitLogin;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")public WebElement loginError;
	
	public Login(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void login()
	{
		signIn.click();
		customerEmail.sendKeys("qatest8788@gmail.com");
		customerPassword.sendKeys("password");
		submitLogin.click();
	}
	
	public String getLoginError()
	{
		return loginError.getText();
	}
	
	
}
