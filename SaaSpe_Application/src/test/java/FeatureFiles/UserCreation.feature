
@tag
Feature: User Management
  This module is for creation the role to the user.

 

  @tag2
  Scenario Outline: Creating the role for the user
   
    Given Open the application "https://dev-app.saaspe.com/"
    Then Enter the username as "navya.mallela@mind-graph.com"
    Then Enter the password as "P@ssword-123477"
    Then Click on the login button
  
    Then Enter the otp
    And Click on the otp submit button
    Then Click on the Administraction link
    Then Click on the User Management link
    Then Click on the Add button
    Then Enter the user first name "<first name>"
    Then Enter the user last name "<last name>"
    Then Enter the user Email Address "<mail>"
    Then Select the role
    And Click on the User Management Submit button
    
     Examples: 
      
		|first name|last name|mail|
		|Jayde|Anton|qusokaso@pelagius.net|