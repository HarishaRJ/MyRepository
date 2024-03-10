package testscript1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExample16 {

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
		Select selection = new Select(returnrequest);
		List<WebElement> allOptions = selection.getOptions();
		for (WebElement SingleOption : allOptions) {
			String value = SingleOption.getText();
			System.out.println(value);

		}
		Thread.sleep(3000);
		driver.quit();
	}
}
