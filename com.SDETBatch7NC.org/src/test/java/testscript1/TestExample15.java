package testscript1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExample15 {
            	public static void main(String[] args) throws Exception {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
				Thread.sleep(5000);
				driver.findElement(By.tagName("button")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//p[contains(text(),'Catalog')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//p[contains(text(),' Products')]")).click();
				Thread.sleep(2000);
				WebElement vendor=driver.findElement(By.id("SearchVendorId"));
				Select selection = new Select(vendor);
	            List<WebElement> allOptions = selection.getOptions();
	            System.out.println("All Options Count is :" + allOptions.size());
	            selection.selectByVisibleText("Vendor 1");
	    		Thread.sleep(3000);
	    		selection.selectByIndex(1);
	    		Thread.sleep(3000);
	    		selection.selectByValue("2");
	    		Thread.sleep(5000);
	    		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	    		driver.quit();

	    	}

	    }