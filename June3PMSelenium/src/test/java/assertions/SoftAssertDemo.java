package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo 
{
	WebDriver driver;
	
  @BeforeMethod
  public void beforeMethod() 
  {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
  }
  
  
  @Test
  public void amazon() 
  {
	    String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		String expectedLink = "Customer Servic";
		
		SoftAssert soft = new SoftAssert();
		//soft.assertEquals(actualLink, expectedLink);
		soft.assertTrue(actualLink.equals(expectedLink), "Both Links are not equal...");
		
		soft.assertTrue(false, "error1");
		
		soft.assertTrue(true, "error2");
		
		soft.assertTrue(false,"error3");
		
		soft.assertTrue(false,"error4");
		
		
		driver.findElement(By.linkText("Customer Service")).click();
		
		soft.assertAll();
		
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}
