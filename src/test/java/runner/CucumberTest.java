package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
					glue = "stepDefs",
					monochrome = true,
					plugin = {"pretty", "html:target/cucumber-html-output",
										"json:target/cucumber-report.json",
										"junit:target/reports/Cucumber.xml",
										"rerun:target/failed.txt"})
public class CucumberTest {

}
