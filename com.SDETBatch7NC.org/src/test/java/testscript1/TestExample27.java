package testscript1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestExample27 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("button"))));
		driver.findElement(By.tagName("button")).click();
		Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//p[contains(text(),'Catalog')]"))));
		Thread.sleep(5000);
		driver.quit();
	}

}
