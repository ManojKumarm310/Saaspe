
@tag
Feature: Department
  I want to use this template for my feature file

  

  @tag2
  Scenario Outline: Single Department Onboarding
    Given Open the application with the url "https://sit-app.saaspe.com/"
    Then I enter the username as "rishi.p@mind-graph.com"
    Then I enter the password as "P@ssword-1"
    Then I click on the login button in the page
    Then Click on the Department from the menu
    Then Click on the Add button in the page
    Then Select the Single Department radio button
    Then Enter the department name "<Department Name>"
    Then Enter the department budget "<Department Budget>"
   # Then Select the department currency "<Department Currency>"
    Then Enter the First Owner Mail id "<Fowner mail>"
    Then Enter the First Owner name "<Fowner name>"
    And Click on the department submit button
    
    

  #  Examples: 
      
