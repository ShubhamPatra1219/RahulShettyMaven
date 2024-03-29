package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchOperaBrowser {
	public static WebDriver opera_driver;

	@BeforeMethod
	public void OperaSetup() {
		WebDriverManager.operadriver().setup();
	}

	@BeforeTest
	public void LaunchOpera() {
		opera_driver = new OperaDriver();
		opera_driver.manage().window().maximize();
	}

	@AfterMethod
	public void CloseBrowser() {
		opera_driver.close();
		opera_driver.quit();
	}
}
