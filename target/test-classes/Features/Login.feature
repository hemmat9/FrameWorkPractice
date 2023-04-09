Feature: SignUp feature

  Background:

    @Regression
    Scenario: filling the form
      Given user navigates to demoqa application
      When user clicks on elements
      And user clicks on text box
      When user enters full name
      And user enters email address
      And user enters current address
      And user enters permanent address
      When user clicks on submit button
      Then user sees the data submitted
