package testscript1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample18 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(3000);
		driver.findElement(By.id("alertButton")).click();
		Alert pop = driver.switchTo().alert();
		Thread.sleep(3000);
		pop.accept();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		Alert pop1 = driver.switchTo().alert();
		Thread.sleep(3000);
		pop1.dismiss();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("promtButtonn")).click();
		Thread.sleep(3000);
		Alert pop2 = driver.switchTo().alert();
		String message = pop2.getText();
		System.out.println(message);
		pop2.sendKeys("Harisha");
		driver.switchTo().defaultContent();
	}

}
