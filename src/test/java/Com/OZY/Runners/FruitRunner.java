package Com.OZY.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/FruitReport.html",
        features = "src/test/resources/FruitSearch.feature",
        glue = "Com/OZY/stepDefinitions",
        dryRun = false,
        tags = ""

)
public class FruitRunner {


}
