Feature: Add Employee functionality


  Scenario: 002-AddEmployee
    Given   User On Login Page
    When    User Input Username
    And     User Input Password
    And     User click Button Login
    And     User Success Login And User Redirect To Dashboard Page
    When    User Click Pim
    And     User Click Add Employee
    And     User Set First Name
    And     User Set Last Name
    And     User Set Employee Id
    And     User Change Display Profile
    And     User Click Create Login Details
    And     User Set Username
    And     User Set Password
    And     User Set Confirm Password
    And     User Click Save
    Then    User Success Add User