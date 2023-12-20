
@tag
Feature: WorkFlow
  Testing the workflow of the application

 

  @tag2
  Scenario Outline: Workflow of the application
     Given Open the application "https://dev-app.saaspe.com/"
    Then Enter the username as "nagarjuna.s@mind-graph.com"
    Then Enter the password as "P@ssword-1"
    Then Click on the login button
  
    Then Enter the otp
    And Click on the otp submit button
    Then Click on the workflow button
    And Click on the create workfow button
    And Select the application
    And Select the date range
    And Enter the Subject "<subject>"
    And Enter the Message "<message>"
    Then Click on the workflow submit button

    Examples: 
      |subject|message|
      |Last login|User last login details|