package Com.OZY.stepDefinitions;

import Com.OZY.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Fruit_Search_StepDef {

    @Given("User is on landing page")
    public void user_is_on_landing_page() {

        Driver.getDriver().get("http://google.com");
    }

    @When("User types {string} list")
    public void userTypesList(String fruit) {

        WebElement searchBox=Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys(fruit+ Keys.ENTER);
    }



    @Then("User see {string}results")
    public void userSeeResults(String title) {

        String expected=Driver.getDriver().getTitle();

        System.out.println("expected = " + expected);

        Assert.assertEquals(expected,title);
    }
}
