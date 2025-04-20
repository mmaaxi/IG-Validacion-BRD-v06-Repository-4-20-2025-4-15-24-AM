Feature: User Logout

  Scenario: Validate logout functionality
    Given the user has logged in with valid credentials
    When the user clicks on the 'Logout' option
    Then the user should be logged out and redirected to the homepage
    When the user tries to access a protected page without logging in
    Then the system should redirect the user to the login page