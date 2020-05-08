package com.zerobank.stepdefinitions;

import com.zerobank.pages.Dashboard;
import com.zerobank.pages.Login;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStep_Definitions {


    Login login = new Login();
    Dashboard dashboard = new Dashboard();

    @Given("user is on the login page") // this line case sensitive based on test step
    // Test step on feature file only cares @Given part
    //  not the method name but
    // we better to name it more understandable
    // since we are gonna deal with end user (non-technical people)
    // so they can easily understand
    // DryRun is preferred way to get implementations
    // IDE can make mistake by creating step definitions from features file
    public void user_is_on_the_login_page() {
        System.out.println("Opening :: " + ConfigurationReader.getProperty("url"));
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        login.clickSignInButton();
    }




    @When("user logs in as {string} into application")
    public void user_logs_in_as_into_application(String value) {
       if(value.equalsIgnoreCase("authorized-user")){
         login.login();
       } else if (value.equalsIgnoreCase("non-authorized-user")){
            login.login(ConfigurationReader.getProperty("non-authorized-user"),ConfigurationReader.getProperty("non-authorized-user-password"));
       } else if(value.equalsIgnoreCase("blank-username")){
           login.login("","");
       }
    }



    @Then("user should verify that user on Account summary page displayed on {string} page")
    public void user_should_verify_that_user_on_Account_summary_page_on_page(String pageName) {
        Assert.assertTrue(dashboard.accountSummaryDisplayed());

    }

    @Then("user should verify that error message displayed")
    public void user_should_verify_that_error_message_displayed() {
        Assert.assertTrue(login.getWarningMessage());
    }



}




