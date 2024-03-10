package testscript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample7 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement email = driver.findElement(By.name("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement psd = driver.findElement(By.name("password"));
		psd.clear();
		psd.sendKeys("admin");
		WebElement login = driver.findElement(By.tagName("buttons"));
		login.click();
		driver.navigate().to(
				"https://www.nopcommerce.com/en/nopcommerce-copyright-removal-key?utm_source=demo-admin-panel&utm_medium=dashboard&utm_campaign=powered_by_nopcommerce");
		driver.navigate().back();
		driver.navigate().forward();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(4000);
		driver.quit();
	}

}
