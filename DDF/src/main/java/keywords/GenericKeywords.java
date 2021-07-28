package keywords;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords 
{
	public WebDriver driver;
	public Properties prop;
	
	public void openBrowser(String browserName)
	{
		System.out.println("Open the Browse : " + browserName);
		
		if(prop.getProperty(browserName).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(prop.getProperty(browserName).equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public void navigate(String url)
	{
		System.out.println("Navigate to :- " + url);
		driver.get(url);
	}
	
	public void click(String locatorKey)
	{
		getElement(locatorKey).click();
	}
	
	public void type(String locatorKey,String text)
	{
		//driver.findElement(By.id(locator)).sendKeys(text);
		getElement(locatorKey).sendKeys(text);
	}
	
	public WebElement getElement(String locatorKey) 
	{
		//check for Presence of Element
		if(!isElementPresent(locatorKey)) {
			//report failure
			System.out.println("Element not present :"+ locatorKey);
		}
		
		//check for visibility of Element
		if(!isElementVisible(locatorKey)) {
			//report failure
			System.out.println("Element is not Visible : " + locatorKey);
		}
		

		WebElement element= null;
		if(locatorKey.endsWith("_id")) {
			element = driver.findElement(By.id(prop.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_name")) {
			element = driver.findElement(By.name(prop.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_xpath")) {
			element = driver.findElement(By.xpath(prop.getProperty(locatorKey)));
		}
		
		return element;
	}

	public boolean isElementVisible(String locatorKey) {
		
		return false;
	}

	public boolean isElementPresent(String locatorKey) {
		
		return false;
	}

	public void select(String locatorKey,String option)
	{
		
	}
	
	public void getText(String locatorKey)
	{
		
	}

}
