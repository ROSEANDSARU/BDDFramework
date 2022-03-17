package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardFeaturePage {

	private WebDriver driver;

	private By dashboardTab = By.xpath("//b[text()='Dashboard']");

	private By timeSheetLink = By.xpath("//span[text()='My Timesheet']");

	public DashboardFeaturePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isTimeSheetLinkExist() {
		
		driver.findElement(dashboardTab).click();
		return driver.findElement(timeSheetLink).isDisplayed();
	}

}
