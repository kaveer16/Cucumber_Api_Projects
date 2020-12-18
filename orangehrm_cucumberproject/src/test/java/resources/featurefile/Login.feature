Feature: Login
  As a user I should login orangehrmdemo website

  @smoke
  Scenario: User is on login page
    Given I enter username "Admin"
    And I enter password "admin123"
    When I click on Login button
    Then I should be able to see welcome text
