Feature: User Login

  Scenario: successful login with valid details
    Given I am on the login page
    When user enter following Creditails:
        |username|password|
        |yuvaraj |Samson#!|
        |notcorret|not    |
    Then validating the alert message
