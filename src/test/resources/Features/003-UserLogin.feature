Feature: New UserLogin functionality

  @Debug
  Scenario: 003-UserLogin
    Given   User On Login Page
    When    User Set Username
    And     User Set Password New
    And     User click Button Login
    Then    User Success Login And User Redirect To Dashboard Page


