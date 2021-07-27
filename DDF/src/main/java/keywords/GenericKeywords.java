package keywords;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords 
{
	public WebDriver driver;
	
	public void openBrowser(String browserName)
	{
		System.out.println("Open the Browse : " + browserName);
		
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void navigate(String url)
	{
		System.out.println("Navigate to :- " + url);
		driver.get(url);
	}
	
	public void click(String locator)
	{
		
	}
	
	public void type(String locator,String text)
	{
		
	}
	
	public void select(String locator,String option)
	{
		
	}
	
	public void getText(String locator)
	{
		
	}

}
