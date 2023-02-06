Feature: PunchOut Functionality

  @Debug
  Scenario: 006-PunchOut
    Given   User On Login Page
    When    User Set Username
    And     User Set Password New
    And     User click Button Login
    Then    User Success Login And User Redirect To Dashboard Page
    When    User Click Icon Clock
#    And     User Set Note
#    And     User Click Button In
#    Then    User Success Punch In
    When    User Set Note Out
    And     User Click Button Out
    Then    User Success Punch Out



