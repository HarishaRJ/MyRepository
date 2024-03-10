package testscript1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestExample21 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(5000);

		action.moveToElement(driver.findElement(By.id("Password"))).perform();

		action.contextClick().perform();

		Thread.sleep(5000);

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(5000);

		action.moveToElement(driver.findElement(By.xpath("//p[contains(text(),'Catalog')]"))).click();

		action.click().perform();

		Thread.sleep(3000);

		action.contextClick().perform();

		Thread.sleep(5000);
		
		driver.quit();

	}

}
