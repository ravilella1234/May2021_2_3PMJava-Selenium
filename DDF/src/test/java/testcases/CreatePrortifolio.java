package testcases;

import org.testng.annotations.Test;

import keywords.ApplicationKeywords;

public class CreatePrortifolio 
{
	
  @Test
  public void createPrortifolio() 
  {
	  //GenericKeywords gkeywords = new GenericKeywords();
	  //ValidationKeywords vKeywords = new ValidationKeywords();
	  ApplicationKeywords aKeywords = new ApplicationKeywords();
	  
	  aKeywords.openBrowser("chrome");
	  aKeywords.navigate("https://www.amazon.in");
	  aKeywords.validateTilte();
	  aKeywords.validateElementPresent();
	  aKeywords.type("abc", "xyz");
	  aKeywords.login();
  }
}
