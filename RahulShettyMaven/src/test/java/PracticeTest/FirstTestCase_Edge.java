package PracticeTest;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase_Edge {

	public static WebDriver edge_driver;

	@BeforeMethod
	public static void SetupChrome() {
		WebDriverManager.edgedriver().setup();
		edge_driver = new EdgeDriver();
		edge_driver.manage().window().maximize();
	}

	@Test
	public void FirstTest() {
		edge_driver.get("https://google.com");
		System.out.println("The Title of the Page is:" + edge_driver.getTitle());
	}

	@AfterMethod
	public void CloseBrowser() {
		edge_driver.close();
	}
}
