package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features",
        glue = "TestSteps",
        plugin = {"pretty",
                "html:target/reports/cucumber.html",
                "json:target/reports/cucumber.json",
                "junit:target/reports/cucumber.xml",
                "rerun:target/reports/cucumber.txt"
        })
public class TestRunner {

}
