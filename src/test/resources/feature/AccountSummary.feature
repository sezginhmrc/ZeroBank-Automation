@AS
Feature: Account Summary

  Background: open login Page
    Given user is on the login page

  Scenario: Page title
    Given user logs in as "authorized-user" into application
    Then user should verify page title is "Zero - Account Summary"

  Scenario: Sub titles
    Given  user logs in as "authorized-user" into application
    Then user should verify Account Summary page following options
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  Scenario: Credit Accounts titles
    Given user logs in as "authorized-user" into application
    Then user should verify Credit Accounts table have following options
      | Account     |
      | Credit Card |
      | Balance     |
