package verifications;

import com.relevantcodes.extentreports.LogStatus;

import launcher.BaseTest;

public class VertifyAndReport extends BaseTest
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
		
		String expectedLink = "Customer Ser";
		
		if(!isLinkEqual(expectedLink))
			//System.out.println("Both links are not equal....");
			reportFail("Both links are not equal....");
		else
			//System.out.println("Both links are equal....");
			reportPass("Both links are equal....");
		
		report.endTest(test);
		report.flush();
	}

	
	
}
