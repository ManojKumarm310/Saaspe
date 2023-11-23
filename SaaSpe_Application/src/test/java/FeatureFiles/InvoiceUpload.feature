
@tag
Feature: Invoice
  Uploading the invoice

  

  @tag2
  Scenario Outline: Uploading the invoice
   Given Open the application with "https://dev-app.saaspe.com/"
    Then Enter the username  "disit59329@unbiex.com"
    Then Enter the password  "P@ssword-1"
    Then Click on the login button in the page
 		Then Enter the otp sent in the mail
    And Click on the otp submit button in the page
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
