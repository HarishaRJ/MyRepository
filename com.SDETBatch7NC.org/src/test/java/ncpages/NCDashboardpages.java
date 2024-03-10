package ncpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//Rule:1 Create class for web page
public class NCDashboardpages {
 WebDriver driver;
 //Rule:2 Provide the webElement information
 By dashboard =By.xpath("//h1[contains(text(),'Dashboard')]");
		 //Rule:3 Create methods for each web element
		
		 public void verifyDashboard() {
boolean val =	 driver.findElement(dashboard).isDisplayed();
	 if(val==true)
		 System.out.println("Login success");
	 else
	 {
		 System.out.println("Login Failed");
	 }
}
 //Rule:4 Create a constructor page class with WebDriver object as an argument
 public NCDashboardpages(WebDriver d) {
	 this.driver=d;
 }
}
