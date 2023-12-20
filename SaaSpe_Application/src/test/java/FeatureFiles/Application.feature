
@tag
Feature: Application
  I want to use this template for my feature file

#  @tag1
 #Scenario: Application Onboarding
 #   Given I will open the application with the url "https://dev-app.saaspe.com/"
  #  Then I enter the username as "rishi.p@mind-graph.com"
   # Then I enter the password as "P@ssword-1"
    #Then I click on the login button in the page
   # Then I select the application option from the menu
   # Then I select the Add button
   # When I select the application type as "New"
   # Then I will select the application "Jira"
   # Then I will provide the provider name "Atlasian"
   # Then I will select the application category "Project Management"
   # Then I will enter the owner mail address "becejyjy@clout.wiki"
   # Then I will enter the reason for onboarding "New Requirement"
   # Then I will select the project "Trailblazer Techniques"
   # Then I will select the currency "MYR"
   # Then I will enter the product name "Standard"
   # Then I will select the product type "License"
   # Then I will enter the unit price "60"
   # Then I will enter the quantity "10"
#    When I click on the Next button
#    When I click on the choose file
#    Then I will provide the supporting document
#    When I click on the Next button
#   Then In similar application page i click on Next button
#    Then I will click on the submit button 
    

  @tag2
  Scenario Outline: Single Application Onboarding
  
   Given Open the application with the url "https://dev-app.saaspe.com/"
    Then I enter the username as "rishi.p@mind-graph.com"
    Then I enter the password as "P@ssword-1"
    Then I click on the login button in the page
    Then I select the application option from the menu
    Then I select the Add button
    When I select the application type as "<App type>"
    Then I will select the application "<Application>"
    Then I will provide the provider name "<Provider>"
    Then I will select the application category "<category>"
    Then I will enter the owner mail address "<Primary Owner>"
    Then I will enter the reason for onboarding "New Requirement"
    Then I will select the project "<Project Name>"
    Then I will select the currency "<currency>"
    Then I will enter the product name "<Product Name>"
    Then I will select the product type "<Product type>"
    Then I will enter the unit price "<Unit Price>"
    Then I will enter the quantity "<Quantity>"
    When I click on the Next button
    When I click on the choose file
    Then I will provide the supporting document
    When I click on the Next button in  document page
    Then In similar application page i click on Next button
    Then I will click on the submit button
    When I close the browser
    
    

    Examples: 
    |App type|Application|Provider|category|Primary Owner|Project Name|currency|Product Name|Product type|Unit Price|Quantity|
     |New|GitHub|Atlasian|Project Management|becejyjy@clout.wiki|Trailblazer Techniques|MYR|Standard|License|75|10|