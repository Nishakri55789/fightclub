package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features= {".//src//test//java"},
glue="stepdefination",
dryRun=true,
monochrome=true,
plugin= {"pretty"}
)
public class TestAllRunners extends AbstractTestNGCucumberTests{
	

}
