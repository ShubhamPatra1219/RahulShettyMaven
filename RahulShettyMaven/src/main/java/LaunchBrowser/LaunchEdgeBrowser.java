package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchEdgeBrowser {
	public static WebDriver edge_driver;

	public void EdgeSetup() {
		WebDriverManager.edgedriver().setup();
	}

	public void LaunchEdge() {
		edge_driver = new EdgeDriver();
	}
}
