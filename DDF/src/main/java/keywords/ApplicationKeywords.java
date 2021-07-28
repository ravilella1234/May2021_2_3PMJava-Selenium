package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ApplicationKeywords extends ValidationKeywords
{
	
	public ApplicationKeywords() throws Exception 
	{
		prop = new Properties();
		try 
		{
			FileInputStream fis = new FileInputStream("D:\\AprilWorkSpace\\DDF\\src\\test\\resources\\project.properties");
			prop.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

	public void login()
	{
		
	}
	
	public void selectDateFromCalendar()
	{
		
	}

}
