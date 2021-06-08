package verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import launcher.BaseTest;

public class Verify2 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.startTest("Verify1");
		test.log(LogStatus.INFO, "Loading the Files......");
				
		launch("chromebrowser");
		test.log(LogStatus.PASS, "Launched the Browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url :- " +  childProp.getProperty("amazonurl"));
		
		WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		loc.sendKeys("sony");
		
		String txt = loc.getAttribute("value");
		System.out.println("Text is : " + txt);
	}

}
