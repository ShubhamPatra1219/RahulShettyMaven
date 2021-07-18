package PracticeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase {

	public static WebDriver chrome_driver;

	@BeforeMethod
	public static void SetupChrome() {
		WebDriverManager.chromedriver().setup();
		chrome_driver = new ChromeDriver();
	}

	@Test
	public void FirstTest() {
		chrome_driver.get("https://google.com");
		System.out.println(chrome_driver.getTitle());
	}
}
