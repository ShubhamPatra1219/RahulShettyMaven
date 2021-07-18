package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchIEBrowser {
	public static WebDriver ie_driver;

	@BeforeMethod
	public void IESetup() {
		WebDriverManager.iedriver().setup();
	}

	@BeforeTest
	public void LaunchIE() {
		ie_driver = new InternetExplorerDriver();
	}
}
