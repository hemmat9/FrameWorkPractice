package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "C:/Users/farha/Umbrella/src/test/resources/Features/Login.feature",
        glue = "Steps",
        dryRun = false,
        monochrome = true,
        tags = "@Regression",
        plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json","rerun:target/failed.txt"}


)

public class RegressionRunner {
}
