@PB 
  Feature: Pay Bills module 
    
    
    Background: 
      Given user is on the login page

      @PB1
      Scenario: Page title 
        Given user logs in as "authorized-user" into application
        When user navigates to "Pay Bills" page
        Then user should verify page title is "Zero - Pay Bills"

        @PB2
     Scenario: Make a payment
       Given  user logs in as "authorized-user" into application
       When user navigates to "Pay Bills" page
       When user enters following data
       | Payee | Account |  Amount  | Date | Description |
       | Sprint |  Checking | 300 | 1    |  Insurance  |
       And user clicks pay button
       Then user verifies that "The payment was successfully submitted." displayed


          @PB3
          Scenario: Negative Make payment scenario
            Given  user logs in as "authorized-user" into application
            When user navigates to "Pay Bills" page
            When user enters  following data
              | Payee | Account |   Date | Description |
              | Sprint |  Checking |  1    |  Insurance  |
            And user clicks pay button
            Then user verifies "Please fill out this field." displayed
