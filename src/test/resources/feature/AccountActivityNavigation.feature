@Navigation
Feature: Navigating to specific accounts in Account Activity

  @N1
  Scenario: Savings account redirect
    Given user is on the login page
    When user logs in as "authorized-user" into application
    And user clicks on "Savings" Link on the Account Summary Page
    And user should verify page title is "Zero - Account Activity"
    Then account type should be "Savings"


  @N2
  Scenario: Brokerage account redirect
    Given user is on the login page
    When user logs in as "authorized-user" into application
    And user clicks on "Brokerage" Link on the Account Summary Page
    And user should verify page title is "Zero - Account Activity"
    Then account type should be "Brokerage"

    @N3
  Scenario: Checking account redirect
    Given user is on the login page
    When user logs in as "authorized-user" into application
    And user clicks on "Checking" Link on the Account Summary Page
    And user should verify page title is "Zero - Account Activity"
    Then account type should be "Checking"


      @N4
      Scenario: Credit Card account redirect
        Given user is on the login page
        When user logs in as "authorized-user" into application
        And user clicks on "Credit Card" Link on the Account Summary Page
        And user should verify page title is "Zero - Account Activity"
        Then account type should be "Credit Card"

        @N5
        Scenario: Loan  account redirect
          Given user is on the login page
          When user logs in as "authorized-user" into application
          And user clicks on "Loan" Link on the Account Summary Page
          And user should verify page title is "Zero - Account Activity"
          Then account type should be "Loan"