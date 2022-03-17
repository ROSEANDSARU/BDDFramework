#Author: Manish.kumar
Feature: Dashboard for the current user

  Scenario: Dashboard feature
    Given user is on login page
    When user enters username "admin"
    And user enters password "admin123"
    And user clicks on Login button
    #And user clicks on DashboardTab
    Then timeSheetlink should be displayed
