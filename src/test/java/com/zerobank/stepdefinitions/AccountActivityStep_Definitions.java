package com.zerobank.stepdefinitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.Dashboard;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountActivityStep_Definitions {

    Dashboard dashboard = new Dashboard();

    @When("user navigates to {string} page")
    public void user_navigates_to_page(String tabname) {
      dashboard.navigateTo(tabname);
    }

    @Then("account type should be {string}")
    public void account_type_should_be(String option) {
        Assert.assertEquals(option,dashboard.selectedOption());
    }


    @Then("account drop down menu should have following options")
    public void account_drop_down_menu_should_have_following_options(List<String> table) {
      Assert.assertEquals(table,dashboard.allSelectOptions());
    }
}
