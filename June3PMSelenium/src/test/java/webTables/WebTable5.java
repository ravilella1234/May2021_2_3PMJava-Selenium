package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable5 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("onward_cal")).click();
		
		while(!driver.findElement(By.xpath("//td[@class='monthTitle']")).getText().contains("Oct 2021"))
		{
			driver.findElement(By.xpath("//td[@class='next']")).click();
		}
		
		List<WebElement> dateList = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr"));
		
		for(int i=1;i<dateList.size();i++)
		{
			driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr["+i+"]")).get(i).getText();
		}
		
	}

}
