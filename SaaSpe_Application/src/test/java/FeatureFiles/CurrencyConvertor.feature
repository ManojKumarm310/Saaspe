
@tag
Feature: Currency Convertor
  This feature is to test the currency conversion in the application.

 

  @tag2
  Scenario Outline: Currency Conversion.
    
    Given Open the application "https://dev-app.saaspe.com/"
    Then Enter the username as "navya.mallela@mind-graph.com"
    Then Enter the password as "P@ssword-1"
    Then Click on the login button
  
    Then Enter the otp
    And Click on the otp submit button
    
    Then Click on the Administration link
    Then Click on the preference link
    Then Select the preferred currency "<currency>"
    And Click on the Save button
    

    Examples: 
     |currency|
     |PHP|
     
