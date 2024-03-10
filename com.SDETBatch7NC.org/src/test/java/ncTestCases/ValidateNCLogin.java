package ncTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ncpages.NCDashboardpages;
import ncpages.NCLoginpage;
import ncpages.NCUtilities;

public class ValidateNCLogin {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();

		NCLoginpage nlp = new NCLoginpage(driver);
		NCDashboardpages ndp = new NCDashboardpages(driver);
		NCUtilities ncu = new NCUtilities(driver);

		ncu.setUp();
		nlp.enterEmail();
		nlp.enterPassword();
		nlp.clickOnLoginBtn();
		Thread.sleep(5000);
		ndp.verifyDashboard();
		ncu.doLogout();
		Thread.sleep(5000);
		ncu.tearDown();

	}

}
