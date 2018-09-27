package skeleton;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Random;

public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait 1 hour$")
    public void waitHour(){

    }

    @Then("^my belly should growl$")
    @And("^my brain is clever$")
    public void growl(){
        Random rnd = new Random();
        if (rnd.nextBoolean()) {
            throw new IllegalStateException("My belly is silent and my brain is foolish!");
        }
    }
}
