package pom;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demoproject.June3PMSelenium.BaseTest;

public class POM_001 extends BaseTest
{
	
  @BeforeMethod
  public void beforeMethod() 
  {
	     System.setProperty("Webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
  }
  
  @Test
  public void f() 
  {
	  Login obj = new Login(driver);
	  obj.login();
	  Assert.assertEquals(obj.getLoginError(), "Authentication failed.");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}
