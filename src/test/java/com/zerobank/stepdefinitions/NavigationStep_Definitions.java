package com.zerobank.stepdefinitions;

import com.zerobank.pages.Dashboard;
import com.zerobank.pages.Navigation;
import com.zerobank.utilities.BrowserMethods;
import io.cucumber.java.en.And;

public class NavigationStep_Definitions {

    Dashboard dashboard = new Dashboard();
    Navigation navigation = new Navigation();


    @And("user clicks on {string} Link on the Account Summary Page")
    public void userClicksOnLinkOnTheAccountSummaryPage(String button) {
        navigation.clickButton(button);

    }
}
