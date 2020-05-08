@AA
Feature: Account Activity module


  Background: open login Page
    Given user is on the login page

    @TC1
  Scenario: Page title
    Given user logs in as "authorized-user" into application
    When user navigates to "Account Activity" page
    Then user should verify page title is "Zero - Account Activity"


  Scenario: Account type
    Given  user logs in as "authorized-user" into application
    When   user navigates to "Account Activity" page
    Then   account type should be "Savings"

  Scenario:Account type dropdowns
    Given  user logs in as "authorized-user" into application
    When   user navigates to "Account Activity" page
    Then   account drop down menu should have following options
      | Savings     |
      | Checking    |
      | Loan        |
      | Credit Card |
      | Brokerage   |