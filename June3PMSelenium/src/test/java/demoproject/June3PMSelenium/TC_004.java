package demoproject.June3PMSelenium;

import com.relevantcodes.extentreports.LogStatus;

public class TC_004 extends BaseTest
{
			
	public static void main(String[] args) throws Exception
	{
		init();
		test = report.startTest("TC_004");
		test.log(LogStatus.INFO, "Loading the Files......");
				
		launch("chromebrowser");
		test.log(LogStatus.PASS, "Launched the Browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url :- " +  childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		test.log(LogStatus.FAIL, "Selected the option Books By using Locator :- " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_id","Harry Potter");
		test.log(LogStatus.PASS, "Entered the text HArry Potter By using Locator :- " + orProp.getProperty("amazonsearchtext_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.PASS, "Clicked on Amazon Search Button By using Locaotr :- " + orProp.getProperty("amazonsearchbutton_xpath"));		
		
		report.endTest(test);
		report.flush();
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

	}
}
