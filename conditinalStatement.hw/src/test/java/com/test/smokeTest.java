package com.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class smokeTest {
	
	 WebDriver dr;
	
	
	@Test 
  public void openBrowser () {
	
	System.setProperty("Webdriver.chrome.driver", "Users/kawcharali/Downloads/chromedriver");
    
	dr.get("https://www.express.com/");
	
	
	
	return dr; 
}
 
 
}


