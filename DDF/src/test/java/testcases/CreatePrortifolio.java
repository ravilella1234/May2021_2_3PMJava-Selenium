package testcases;

import org.testng.annotations.Test;

import keywords.ApplicationKeywords;

public class CreatePrortifolio 
{
	
  @Test
  public void createPrortifolio() throws Exception 
  {
	  //GenericKeywords gkeywords = new GenericKeywords();
	  //ValidationKeywords vKeywords = new ValidationKeywords();
	  ApplicationKeywords aKeywords = new ApplicationKeywords();
	  
	  aKeywords.openBrowser("browser");
	  aKeywords.navigate("https://portfolio.rediff.com/portfolio-login");
	  aKeywords.type("username_id", "ravilella2021@rediffmail.com");
	  aKeywords.type("password_xpath", "Sai@2015");
	 // aKeywords.validateElementPresent("login_sumbit_name");
	  aKeywords.click("login_sumbit_name");
	  
  }
}
