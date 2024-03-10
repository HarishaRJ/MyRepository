package testscript1;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample11 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		String src = driver.getPageSource();
		System.out.println(src);
		Thread.sleep(5000);
		driver.quit();
	}

}
