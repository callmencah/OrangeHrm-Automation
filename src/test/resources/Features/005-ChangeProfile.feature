Feature: ChangeProfile Functionality

  @Debug
  Scenario: 005-ChangeProfile
    Given   User On Login Page
    When    User Set Username
    And     User Set Password New
    And     User click Button Login
    Then    User Success Login And User Redirect To Dashboard Page
    When    User Click My Info
    And     User Set National
    And     User Set Marital
    And     User Set Gender
    And     User Click Button Save
    Then    User Success Change Profile