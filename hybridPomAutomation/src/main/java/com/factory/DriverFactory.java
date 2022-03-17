package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	/**
	 * Method to initialize the threadlocal and set the driver as per the chrome
	 * @param browser
	 * @return
	 */
	
	public WebDriver initDriver(String browser) {

		System.out.println("Selected - browser as : " + browser);

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			threadLocalDriver.set(new ChromeDriver());
		} else if (browser.equalsIgnoreCase("safari")) {
			WebDriverManager.firefoxdriver().setup();
			threadLocalDriver.set(new SafariDriver());

		} else {
			System.out.println("Incorrect or not supported browser value is passed");
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();

	}

	/**
	 * method used to get the threadsafe diver
	 * @return
	 */
	public static synchronized  WebDriver getDriver() {
		return threadLocalDriver.get();

	}

}
