package verifications;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import launcher.BaseTest;

public class Verify1 extends BaseTest
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
		
		//String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		String actualLink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String expectedLink = "Customer Ser";
		
		System.out.println("ActualLink :" + actualLink);
		System.out.println("ExpectedLink : " + expectedLink);
		
		//if(actualLink.equals(expectedLink))
		//if(actualLink.equalsIgnoreCase(expectedLink))
		if(actualLink.contains(expectedLink))
			System.out.println("Both links are equal.....");
		else
			System.out.println("Both links are not equal...");
		
	}

}
