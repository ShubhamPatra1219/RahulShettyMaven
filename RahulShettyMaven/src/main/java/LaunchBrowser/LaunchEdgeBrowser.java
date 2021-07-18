package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchEdgeBrowser {
	public static WebDriver edge_driver;

	@BeforeMethod
	public void EdgeSetup() {
		WebDriverManager.edgedriver().setup();
	}

	@BeforeTest
	public void LaunchEdge() {
		edge_driver = new EdgeDriver();
	}
}
