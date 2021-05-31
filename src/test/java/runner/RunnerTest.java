package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\features"},
		glue= {"steps","hooks"},
		tags="@Search-Page",
		plugin= {"pretty","json:target\\cucumber-reports\\cucumber.json","html:target\\cucumber-reports\\Index.html",
				"junit:target\\cucumber-reports\\cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome=true
		)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
