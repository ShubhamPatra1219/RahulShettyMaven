package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefoxBrowser {
	public static WebDriver firefox_driver;

	public static void FirefoxSetup() {
		WebDriverManager.firefoxdriver().setup();
	}

	public void LaunchFirefox() {
		firefox_driver = new FirefoxDriver();
	}
}
