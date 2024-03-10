package testscript1;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample5 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);
		driver.quit();
	}

}
