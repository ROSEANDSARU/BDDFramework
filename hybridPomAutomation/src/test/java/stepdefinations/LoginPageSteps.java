package stepdefinations;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.LoginPage;

import io.cucumber.java.en.*;

public class LoginPageSteps {
	private static String pageTitle;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {

		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {

		pageTitle = loginPage.getPageTitle();
		System.out.println("Login page title is : " + pageTitle);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		Assert.assertTrue(pageTitle.contains("expectedTitle"));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {

		Assert.assertTrue(loginPage.isForgetPasswordLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String uName) {
		loginPage.enterUserName(uName);
	}

	@When("user enters password {string}")
	public void user_enters_password(String passwd) {
		loginPage.enterPasswrod(passwd);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLogin();
		System.out.println("user clicked on login button");

	}

	@Then("user is on the welcome Window")
	public void user_is_on_the_welcome_Window() {
		Assert.assertTrue(loginPage.isUserOnWelcomeWindow());

	}

}
