package step_definition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//runner class
@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src/test/resources/hooksDemo.feature",
		glue = {"step_definition"},
		monochrome = true,
		plugin = {"pretty","html:target/HTMLReports",
				  "json:target/JSON/report.json",
				  "junit:target/JunitReports/Reports.xml"}
	
)
public class runnerHooksDemo 
{
 public static void main(String[] args)
 {
	 
 }
}
