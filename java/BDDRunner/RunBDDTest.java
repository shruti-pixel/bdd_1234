package BDDRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:target/cucumber-report.json"
        ,features = {"src/test/resources/Feature", "src/test/resources/Feature/APIFeatures", "src/test/resources/Feature/UIFeatures"}
        , glue = { "src/test/java/stepdefinitions" }
        , tags = {"@mytest"}
)
public class RunBDDTest {

}
