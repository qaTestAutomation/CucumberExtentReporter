package com.cucumber.stepdefinitions;

import com.cucumber.listener.Reporter;
import com.sun.javaws.exceptions.InvalidArgumentException;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.io.IOException;

public class MyStepdefs {

    @Given("I have (\\d+) cukes in my belly") public void I_have_cukes_in_my_belly(int cukes)
        throws IOException {
        Reporter.addStepLog("My test addStepLog message");
        Reporter.addScenarioLog("This is scenario log");
        if (cukes == 1) {
            throw new RuntimeException("Run time exception");
        }
        Assert.assertTrue(false);
        //        Reporter.addScreenCaptureFromPath(
        //            "/Users/vimalrajselvam/Downloads/best-resume-template-2016-3.jpg", "My title");
    }

    @Given("I have (\\d+) cukes in my bellies") public void I_have_cukes_in_my_bellies(int cukes) {
        System.out.format("Cukes: %n\n", cukes);
        if (cukes == 7) {
            throw new IllegalArgumentException("Super exception");
        }
        Assert.assertTrue(false);
    }

    @Then("^I print$") public void iPrint() throws Throwable {
        //        Assert.assertTrue(false);
        Assert.assertTrue(false);
    }

    @When("^I login with credentials$") public void iLoginWithCredentials(DataTable table) {
        Assert.assertTrue(false);
    }
}
