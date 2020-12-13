package Com.OZY.stepDefinitions;

import Com.OZY.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Car_Search_StepDef {

    @Given("User is on landing page_for_car")
    public void userIsOnLandingPage_for_car() {
        Driver.getDriver().get("http://google.com");
    }

    @When("User types {string} listOfCar")
    public void userTypesListOfCar(String car) {

        WebElement searchBox=Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys(car+ Keys.ENTER);
    }

    @Then("User see {string}resultsOfCarTitle")
    public void userSeeResultsOfCarTitle(String title) {

        String expected=Driver.getDriver().getTitle();

        System.out.println("expected = " + expected);

        Assert.assertEquals(expected,title);
    }
}
