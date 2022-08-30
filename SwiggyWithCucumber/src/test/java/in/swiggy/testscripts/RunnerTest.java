package in.swiggy.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Folder"
				, glue = "in.swiggy.testscripts"
				, plugin = {"progress","html:target/Cucumber.html"}
				, tags = "@TC_102"
				 
				)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
