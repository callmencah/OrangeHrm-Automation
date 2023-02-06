Feature: PunchIn functionality

  @Debug
  Scenario: 004-PunchIn
    Given   User On Login Page
    When    User Set Username
    And     User Set Password New
    And     User click Button Login
    Then    User Success Login And User Redirect To Dashboard Page
    When    User Click Icon Clock
    And     User Set Note
    And     User Click Button In
    Then    User Success Punch In



