package pom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demoproject.June3PMSelenium.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POM_001 extends BaseTest
{
	
  @BeforeMethod
  public void beforeMethod() throws Exception 
  {
	  	init();
	     //System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\chromedriver.exe");
	  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
  }
  
  @Test(enabled = false)
  public void f() 
  {
	  Login obj = new Login(driver);
	  obj.login();
	  Assert.assertEquals(obj.getLoginError(), "Authentication failed.");
  }
  
  @Test
  public void registration() throws Exception
  {
	  CustomerRegistration obj = new CustomerRegistration(driver);
	  obj.customerRegistration();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}
