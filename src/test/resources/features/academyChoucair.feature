@stories
Feature: Utes
  User wants to register on the utes.com page to be able to access new content
  @scenario1
  Scenario: Register web
    Given Go to the utes home page, select the Join Today button to register, and fill in all the details
    |strFirstname |strLastname    |
    |AndresJose   |SanchezRamirez |
    When Andres has already registered, we are going to try entering the log in and we are going to select Enter the email and select reset password
    |strLogin        |
    |Forgot Password?|
    Then The login window will load, with the title login
    |strQuestion      |
    |Sign in to uTest |