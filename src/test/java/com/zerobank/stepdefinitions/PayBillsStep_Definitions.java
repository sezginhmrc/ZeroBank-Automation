package com.zerobank.stepdefinitions;

import com.zerobank.pages.Dashboard;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class PayBillsStep_Definitions {

    Dashboard dashboard = new Dashboard();

    @When("user enters following data")
    public void user_enters_following_data(List<Map<String, String>> dataTable) {
       dashboard.selectPaymentCard(dataTable.get(0).get("Payee"));
       dashboard.selectAccountType(dataTable.get(0).get("Account"));
       dashboard.enterAmount(dataTable.get(0).get("Amount"));
       dashboard.selectDate(dataTable.get(0).get("Date"));
       dashboard.enterDescription(dataTable.get(0).get("Description"));
    }

    @And("user clicks pay button")
    public void userClicksPayButton() {
        dashboard.clickPayButton();
    }

    @Then("user verifies that {string} displayed")
    public void user_verifies_that_displayed(String string) {
        Assert.assertEquals(string,dashboard.paymentSucces());
    }


    @When("user enters  following data")
    public void userEntersFollowingData(List<Map<String, String>> dataTable) {
        dashboard.selectPaymentCard(dataTable.get(0).get("Payee"));
        dashboard.selectAccountType(dataTable.get(0).get("Account"));
    //    dashboard.enterAmount(dataTable.get(0).get("Amount"));
        dashboard.selectDate(dataTable.get(0).get("Date"));
        dashboard.enterDescription(dataTable.get(0).get("Description"));
    }

    @Then("user verifies {string} displayed")
    public void userVerifiesDisplayed(String value) {
            Assert.assertEquals(value,dashboard.popupErrorMessage());
    }
}
