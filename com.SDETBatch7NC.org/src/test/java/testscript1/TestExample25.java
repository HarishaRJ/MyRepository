package testscript1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample25 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get(
				"https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=12869818046717105736&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9147197&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kurtis for women");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
