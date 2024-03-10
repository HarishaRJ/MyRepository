package testscript1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExample30 {

	public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(40));
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	driver.findElement(By.tagName("button")).click();
	System.out.println("Login Successfully");
	List<WebElement> allInputs= driver.findElements(By.xpath("//input"));
	for(WebElement input : allInputs) {
		String Val=input.getAttribute("name");
		System.out.println(Val);
	}
	Thread.sleep(5000);
	driver.quit();
	}
	}
