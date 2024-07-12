
@tag
Feature: Changes feature in the ITSM
  

 

  @tag2
  Scenario Outline: Title of your scenario outline
    Given url "https://stardesk-itsm-ui-dev.myairports.com.my/addchange"
    Then username "bhanu"
    Then password "Test@321"
    Then Click on the Changes button in the side menu
    Then Click on the Create New button
    Then Enter the phone number "<pno>"
    Then Enter subject "<subject>"
    Then Enter the description "<des>"
    Then Select the impact "<impact>"
    Then Select the urgency "<urgency>"
    Then Select classfication "<classfication>"
    Then Select the Risk "<risk>"
    Then Select the Change Type "<change>"
    
    

    Examples: 
     |pno|subject|des|impact|urgency|classfication|risk|change|
     |54354356457600|Change Requirement|Ok|1. High|2. Medium|Urgent|2. Major|Maintenance|
