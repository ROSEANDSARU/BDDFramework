package stepdefinations;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.DashboardFeaturePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps {

	private DashboardFeaturePage dashboardPage = new DashboardFeaturePage(DriverFactory.getDriver());

	@When("user clicks on DashboardTab")
	public void user_clicks_on_dashboard_tab() {
	
	
	}

	@Then("timeSheetlink should be displayed")
	public void time_sheetlink_should_be_displayed() {
		Assert.assertTrue(dashboardPage.isTimeSheetLinkExist());

	}

}
