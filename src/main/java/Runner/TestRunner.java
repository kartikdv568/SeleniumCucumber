package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features/test1.feature",
		glue = {"Stepdefinition"},
		
		
		format = {"pretty","html:target/cucumber-html-report"}
		
		
		)
public class TestRunner {

}
