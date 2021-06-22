package excelDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookDemo 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\testdata2.xlsx");
		
		for(int i=1;i<e.getRowCount("login");i++)
		{
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(e.getCellData("login", "UserName", i));
			
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(e.getCellData("login", "Password", i));
			
			Thread.sleep(4000);
		}
		
		

	}

}
