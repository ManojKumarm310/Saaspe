
@tag
Feature: Department
  I want to use this template for my feature file

  

  @tag2
  Scenario Outline: Single Department Onboarding
    # Given Open the application with the url "https://dev-app.saaspe.com/"
    Given Open the application "https://dev-app.saaspe.com/"
    Then Enter the username as "rishi.p@mind-graph.com"
    Then Enter the password as "P@ssword-1"
    Then Click on the login button
  #  Then I enter the username as "rishi.p@mind-graph.com"
  #  Then I enter the password as "P@ssword-1"
   # Then I click on the login button in the page
    Then Enter the otp
    And Click on the otp submit button
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
      |Department Name|Department Budget|Fowner mail|Fowner name|
			|Maintainance|13000|vyvewyru@afia.pro|Postumus|	