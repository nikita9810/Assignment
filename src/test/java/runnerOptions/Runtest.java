package runnerOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
	   
		features = "src/test/java/features/Register.feature",
	    glue= {"stepDefinations"})
	    //tags= {"@Positive"},
	   // strict=true,monochrome=true,
	   // plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"})
public class Runtest {

}