package testscript1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample10 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement email = driver.findElement(By.name("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement psd = driver.findElement(By.id("Password"));
		psd.clear();
		psd.sendKeys("admin");
		WebElement login = driver.findElement(By.xpath("//div[@class='buttons']"));
		login.click();
		Thread.sleep(5000);
		driver.navigate().to("https://docs.nopcommerce.com/running-yourtore/customer-management/customer-roles.html?utm_source=demo-admin-panel&utm_medium=admin-page&utm_campaign=documentation&utm_content=doc-reference");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		driver.quit();
	}

}
