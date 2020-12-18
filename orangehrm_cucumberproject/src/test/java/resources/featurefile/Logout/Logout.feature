Feature: Logout
  As a user I should logout orangehrmdemo website

   @regression
   Scenario: User is on login page
     Given I enter username "Admin"
     And I enter password "admin123"
     And I click on Login button
     And I click on Welcome button
     And I click on Logout button
     Then I should be able to see Login Panel text
