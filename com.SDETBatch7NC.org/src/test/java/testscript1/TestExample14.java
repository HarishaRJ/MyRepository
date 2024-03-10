package testscript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample14 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement email = driver.findElement(By.name("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement psd = driver.findElement(By.id("Password"));
		psd.clear();
		psd.sendKeys("admin");
		boolean val = driver.findElement(By.id("RememberMe")).isSelected();
		System.out.println("is checkbox got selected?:" + val);
		boolean val1 = driver.findElement(By.tagName("button")).isEnabled();
		System.out.println("is login got enabled?:" + val1);
		driver.findElement(By.tagName("button")).click();
		boolean dis = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();
		System.out.println("is Dashboard page Displayed?:" + dis);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(text(),'Catalog')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),' Products')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(2000);
		boolean value = driver.findElement(By.name("Email")).isDisplayed();
		System.out.println("is logged out successfully:" + value);
		driver.quit();
	}
}