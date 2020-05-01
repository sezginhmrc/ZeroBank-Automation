@Login_Feature
Feature: Login
  As i user i should be able to login to the application

  Background:
    Given user is on the login page


  @Positive_Scenario
  Scenario: Log in with valid crendentials and verify Account summary page displayed
    When user logs in as authorized user
    Then user should verify Account summary page is displayed


  @Negative_scenario
  Scenario: Log in with invalid credentials and verify user not able to login
    When user logs in with random credentials
    Then user should verify that error message displayed


  @Scenario_SkipLogin
  Scenario: Login without entering credentials
    When user logins without credentials
    Then user should verify that eror message displayed




