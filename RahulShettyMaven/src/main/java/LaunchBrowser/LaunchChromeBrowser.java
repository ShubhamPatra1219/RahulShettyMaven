package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBrowser {
	public static WebDriver chrome_driver;

	@BeforeMethod
	public static void SetupChrome() {
		WebDriverManager.chromedriver().setup();
	}

	@BeforeTest
	public void LaunchChrome() {
		chrome_driver = new ChromeDriver();
		chrome_driver.manage().window().maximize();
	}

	@AfterMethod
	public void CloseBrowser() {
		chrome_driver.close();
		chrome_driver.quit();
	}
}
