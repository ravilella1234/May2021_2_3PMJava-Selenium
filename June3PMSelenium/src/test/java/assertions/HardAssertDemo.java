package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardAssertDemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		String expectedLink = "Customer Servic";
		
		//Assert.assertEquals(actualLink, expectedLink);
		Assert.assertTrue(actualLink.equals(expectedLink), "Both Links are are equal....");
		
		driver.findElement(By.linkText("Customer Service")).click();
	}

}
