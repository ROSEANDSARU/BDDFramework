package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/applicationFeatures" }, glue = { "stepdefinations", "hooks" }, plugin = {
		"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/"
},monochrome = true,
		publish = true
		

)

public class Runner {

}
