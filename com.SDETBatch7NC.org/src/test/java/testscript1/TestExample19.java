package testscript1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample19 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(5000);
		driver.switchTo().frame(3);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@title-\"view larger image\"])[1]")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
