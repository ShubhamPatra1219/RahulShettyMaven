package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchOperaBrowser {
	public static WebDriver opera_driver;

	public void OperaSetup() {
		WebDriverManager.operadriver().setup();
	}

	public void LaunchOpera() {
		opera_driver = new OperaDriver();
	}
}
