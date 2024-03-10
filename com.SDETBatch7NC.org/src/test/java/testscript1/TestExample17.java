package testscript1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample17 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(text(), 'Sales')]")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//p[contains(text(), ' Return requests')]"));
		Thread.sleep(3000);
		ele.click();
		WebElement returnrequest = driver.findElement(By.name("ReturnRequestStatusId"));
		Thread.sleep(3000);
		returnrequest.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		returnrequest.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		returnrequest.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		returnrequest.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		returnrequest.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		driver.quit();

	}

}
