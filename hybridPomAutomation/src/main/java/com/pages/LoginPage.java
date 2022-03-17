package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	private By userName = By.id("txtUsername");
	private By password = By.id("txtPassword");
	private By Login = By.id("btnLogin");
	private By forgetPasswrodLink = By.linkText("Forgot your password?");
	private By welcomeWindow = By.id("welcome");

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// page actions method

	public String getPageTitle() {

		return driver.getTitle();
	}

	public boolean isForgetPasswordLinkExist() {

		return driver.findElement(forgetPasswrodLink).isDisplayed();
	}

	public void enterUserName(String username) {

		driver.findElement(userName).sendKeys(username);
	}

	public void enterPasswrod(String pwd) {

		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {

		driver.findElement(Login).click();
	}
	
	public boolean isUserOnWelcomeWindow(){
		return driver.findElement(welcomeWindow).isDisplayed();
	}
}
