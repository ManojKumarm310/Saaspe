
@tag
Feature: Sign Up of the application
  I want to use this template for my feature file

  @tag1
  Scenario: Sign Up
    Given I will open the application with the url "https://sit-app.saaspe.com/"
    When I click on the Sign Up option
    Then I enter the user first name "Nohemi"
    Then I enter the user last name "Alaya"
    Then I enter the user mail id "vucoze@hexi.pics"
    Then I enter the user mobile number "8941267305"
    Then I enter the designation of the user "Manager"
    Then I enter the password of the user "P@ssword-1"
    Then I click on the terms and condition check box
    And I click on the submit button
    When User close the browser

  @tag2
  Scenario Outline: Sign Up with Invalid Data
    
Given I will open the application with the url "https://sit-app.saaspe.com/"
    When I click on the Sign Up option
    Then I enter the user first name "<fname>"
    Then I enter the user last name "<lname>"
    Then I enter the user mail id "<mail id>"
    Then I enter the user mobile number "<pno>"
    Then I enter the designation of the user "<role>"
    Then I enter the password of the user "<password>"
    Then I click on the terms and condition check box
    And I click on the submit button
    When User close the browser
    
    
    Examples: 
      
  |fname|lname|mail id|pno|role|password|
	|123456|098765|manoj@|8904321|man123|password1|