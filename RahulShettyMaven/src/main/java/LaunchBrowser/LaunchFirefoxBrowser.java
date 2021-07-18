package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefoxBrowser {
	public static WebDriver firefox_driver;

	@BeforeMethod
	public static void FirefoxSetup() {
		WebDriverManager.firefoxdriver().setup();
	}

	@BeforeTest
	public void LaunchFirefox() {
		firefox_driver = new FirefoxDriver();
	}
}
