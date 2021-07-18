package PracticeTest;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase_Firefox {

	public static WebDriver firefox_driver;

	@BeforeMethod
	public static void SetupChrome() {
		WebDriverManager.firefoxdriver().setup();
		firefox_driver = new FirefoxDriver();
		firefox_driver.manage().window().maximize();
	}

	@Test
	public void FirstTest() {
		firefox_driver.get("https://google.com");
		System.out.println("The Title of the Page is:" + firefox_driver.getTitle());
	}

	@AfterMethod
	public void CloseBrowser() {
		firefox_driver.close();
	}
}
