package Com.OZY.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/Car_Report.html",
        features = "src/test/resources/CarRunner.feature",
        glue = "Com/OZY/stepDefinitions",
       // dryRun = false,
        tags = "@smoke_test"

)
public class CarRunner {


}
