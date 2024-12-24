package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "background.feature" },

		glue = { "TestBackground.java" },

		dryRun = false,

		monochrome = true

)
public class TestRunnerDataProvider {

}
