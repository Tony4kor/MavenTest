package run_tests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features = "feature_files", monochrome = true, dryRun = false,
        glue = {"step_definitions"},
        plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json" })

public class TestRunner extends AbstractTestNGCucumberTests{


}
