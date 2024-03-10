package testscript1;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestExample13 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//p[contains(text),'Help')]")).click();
		driver.findElement(By.xpath("//p[contains(text),'Training')]")).click();
		driver.findElement(By.xpath("//p[contains(text),'Documentation')]")).click();
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		driver.quit();
	}

}
