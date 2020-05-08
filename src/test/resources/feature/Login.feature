@L
Feature: Login
  As i user i should be able to login to the application

  Background:
    Given user is on the login page


  @Positive_Scenario
  Scenario: Log in as an authorized user
    When user logs in as "authorized-user" into application
    Then user should verify that user on Account summary page displayed on "Dashboard" page


  @Negative_Scenario1
  Scenario: Log in with invalid credentials and verify user not able to login
    When user logs in as "non-authorized-user" into application
    Then user should verify that error message displayed


  @Negative_Scenario2
  Scenario: Login without entering credentials
    When user logs in as "blank-username" into application
    Then user should verify that error message displayed




