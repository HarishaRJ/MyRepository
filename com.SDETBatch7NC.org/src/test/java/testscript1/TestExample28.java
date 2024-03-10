package testscript1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample28 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(40));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript(
				"document.getElementsByTagName('button')[0].setAttribute('style','border:4px red solid;background:yellow');");
		Thread.sleep(3000);
		jse.executeScript("document.getElementsByTagName('button')[0].click();");
		Thread.sleep(3000);
		jse.executeScript("window.scrollTo(0,300);");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400);");
		Thread.sleep(3000);
		jse.executeScript("document.getElementById('SearchRegistrationDateFrom')[1].srollIntoView();");
		Thread.sleep(3000);
		driver.quit();

	}

}
