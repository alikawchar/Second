package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shrared {

	WebDriver dr;
	
		
		public void LoopPractice (List<WebElement> elements, WebDriver dr) {
			
			 for (int i = 1; i <= elements.size();i++) {
			 
			  elements.get(i).click();
			  dr.navigate().back();
		
		
		}
	}
		public void looponManue () {
			int s = dr.findElements(By.xpath("//*[@id=\"raven-header-mega-menu\"]/nav/ol")).size();
			for (int i = 1; i <=s;i ++);
			dr.findElements(By.xpath("//ol[@class=\"Cw6Gc\"]/li"));
			
		}

	
	
}
