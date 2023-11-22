
@tag
Feature: Invoice Upload
  This feature is regarding the uploading the invoice

  

  @tag2
  Scenario Outline: Invoice Onboarding
   Given Open the application "https://dev-app.saaspe.com/"
    Then Enter the username as "disit59329@unbiex.com"
    Then Enter the password as "P@ssword-1"
    Then Click on the login button
		Then Enter the otp
    And Click on the otp submit button
    Then Click on the Invoice button
    And Click on the Invoice Add button
    Then Enter the Invoice number "<invoice number>"
    And Select the Subscription id "<subscription id>"
    And Select the invoice currency "<invoice currency>"
    And Enter the invoice amount "<invoice amount>"
    And Enter the Start date "<start date>"
    And Enter the End date "<end date>"
    And Enter the Due date "<due date>"
    Then Upload the invoice document
    And Click on the invoice submit button
    
    

    Examples: 
    
    |invoice number|subscription id|invoice currency|invoice amount|start date|end date|due date|
      
