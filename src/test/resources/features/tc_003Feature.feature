Feature: Password Recovery Function
  Scenario: Validate password recovery functionality
    Given the user is on the login page
    When the user clicks on the 'Forgot Password' link
    Then the system redirects to the password recovery page
    When the user enters a registered email
    Then the system accepts the email and allows user to proceed
    When the user clicks on the 'Send' button
    Then a confirmation message indicating the recovery email has been sent is displayed
    And the user checks the inbox of the entered email
    Then the password recovery email is received