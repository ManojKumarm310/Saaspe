#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

 

  @tag2
  Scenario Outline: Invoice Upload
    
    Given Open the application "https://dev-app.saaspe.com/"
    Then Enter the username as "disit59329@unbiex.com"
    Then Enter the password as "P@ssword-1"
    Then Click on the login button
  
    Then Enter the otp
    And Click on the otp submit button
    Then Click on the invoice button
    And Click on the invoice add button
    Then Enter the invoice number "<invoice number>"
    And Select the subscription id "<subscription id>"
    And Select the invoice currency "<invoice currency>"
    And Enter the invoice amount "<invoice amount>"
    Then Select the start date "<start date>"
    Then Select the end date "<end date>"
    Then Select the due date "<due date>"
    Then Upload the invoice document
    And Click on the invoice submit button

    Examples: 
     
     |invoice number|subscription id|invoice currency|invoice amount|start date|end date|due date|
|906|id3180|MYR|10000|22/11/2023|21/11/2024|21/11/2024|