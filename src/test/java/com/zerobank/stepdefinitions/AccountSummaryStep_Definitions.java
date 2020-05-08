package com.zerobank.stepdefinitions;

import com.zerobank.pages.Dashboard;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStep_Definitions {

    Dashboard dashboard = new Dashboard();



    @Then("user should verify page title is {string}")
    public void user_should_verify_page_title_is(String title) {
        Assert.assertEquals(title, Driver.getDriver().getTitle());
    }



    @Then("user should verify Account Summary page following options")
    public void user_should_verify_Account_Summary_page_following_options(List<String> accountSummaryTitles) {
     Assert.assertEquals(accountSummaryTitles,dashboard.getAccountSummaryTitles());
    }




    @Then("user should verify Credit Accounts table have following options")
    public void user_should_verify_Credit_Accounts_table_have_following_options(List<String> creditAccountTitles) {
        Assert.assertEquals(creditAccountTitles,dashboard.getCreditAccountsTitles());
    }



}
