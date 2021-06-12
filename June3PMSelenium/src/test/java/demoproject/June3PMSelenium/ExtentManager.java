package demoproject.June3PMSelenium;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseTest
{
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{
		if(report==null)
		{
			report = new ExtentReports(projectPath+"//HtmlReports//report.html");
			report.loadConfig(new File(projectPath+"//extentconfig.xml"));
			report.addSystemInfo("Language Binding", "3.141.59").addSystemInfo("Environment", mainProp.getProperty("env"));
		}
		
		return report;
	}

}
