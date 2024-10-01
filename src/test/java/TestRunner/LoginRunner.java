package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( tags="", features= {"C:\\Users\\D. hussain\\eclipse-workspace\\BDD_FRAMEWORK_SWAGLAB\\src\\main\\resources\\FeatureFile"},
glue= {"Stepdifination"},
dryRun=false,
monochrome=true,
plugin= {"pretty", "html:target/Cucumber-report/htmlreport.html"}
		) 

public class LoginRunner  {

}
