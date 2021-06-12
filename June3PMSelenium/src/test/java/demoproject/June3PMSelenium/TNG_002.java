package demoproject.June3PMSelenium;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest
{
	
  @BeforeMethod
  @Parameters("browser")
  public void startProcess(String bType) throws Exception 
  {
	    init();
		test = report.startTest("TNG_002");
		test.log(LogStatus.INFO, "Loading the Files......");
				
		launch(bType);
		test.log(LogStatus.PASS, "Launched the Browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url :- " +  childProp.getProperty("amazonurl"));
  }
  
  @Test
  public void amazon() 
  {
	    selectOption("amazondropbox_id","Books");
		test.log(LogStatus.FAIL, "Selected the option Books By using Locator :- " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_id","Harry Potter");
		test.log(LogStatus.PASS, "Entered the text HArry Potter By using Locator :- " + orProp.getProperty("amazonsearchtext_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.PASS, "Clicked on Amazon Search Button By using Locaotr :- " + orProp.getProperty("amazonsearchbutton_xpath"));
  }
  

  @AfterMethod
  public void endProcess() 
  {
	  report.endTest(test);
	  report.flush();
		
	  driver.quit();
  }

}
