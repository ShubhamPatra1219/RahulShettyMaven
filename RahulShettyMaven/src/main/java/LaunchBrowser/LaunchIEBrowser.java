package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchIEBrowser {
	public static WebDriver ie_driver;

	public void IESetup() {
		WebDriverManager.iedriver().setup();
	}
	
	public void LaunchIE() {
		ie_driver = new InternetExplorerDriver();
	}
}
