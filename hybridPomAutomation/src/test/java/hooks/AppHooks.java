package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {

	private DriverFactory driverFactory;
	private ConfigReader configReader;
	private WebDriver driver;
	Properties prop;

	@Before(order = 0)
	public void getProperties() {
		configReader = new ConfigReader();
		prop = configReader.initializeProperites();

	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserValue = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.initDriver(browserValue);

	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario){
		if(scenario.isFailed()){
			String screenShotName = scenario.getName().replaceAll(" ", "_");
			byte [] sourcePath =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenShotName);
		}
	}
}
