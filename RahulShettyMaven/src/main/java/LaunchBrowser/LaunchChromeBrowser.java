package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBrowser {
	public static WebDriver chrome_driver;

	public static void SetupChrome() {
		WebDriverManager.chromedriver().setup();
	}

	public void LaunchChrome() {
		chrome_driver = new ChromeDriver();
	}
}
