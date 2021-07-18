package PracticeTest;

import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase_InternetExplorer {

	public static WebDriver ie_driver;

	@BeforeMethod
	public static void SetupChrome() {
		WebDriverManager.iedriver().setup();
		ie_driver = new InternetExplorerDriver();
		ie_driver.manage().window().maximize();
	}

	@Test
	public void FirstTest() {
		ie_driver.get("https://google.com");
		System.out.println("The Title of the Page is:" + ie_driver.getTitle());
	}

	@AfterMethod
	public void CloseBrowser() {
		ie_driver.close();
	}
}
