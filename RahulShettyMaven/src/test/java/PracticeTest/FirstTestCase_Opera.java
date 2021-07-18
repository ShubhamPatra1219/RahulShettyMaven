package PracticeTest;

import org.openqa.selenium.*;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase_Opera {

	public static WebDriver opera_driver;

	@BeforeMethod
	public static void SetupChrome() {
		WebDriverManager.operadriver().setup();
		opera_driver = new OperaDriver();
		opera_driver.manage().window().maximize();
	}

	@Test
	public void FirstTest() {
		opera_driver.get("https://google.com");
		System.out.println("The Title of the Page is:" + opera_driver.getTitle());
	}

	@AfterMethod
	public void CloseBrowser() {
		opera_driver.close();
	}
}
