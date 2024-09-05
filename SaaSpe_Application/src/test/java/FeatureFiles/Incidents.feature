
@tag
Feature: Incidents feature in the ITSM
  

  

  @tag2
  Scenario Outline: ITSM
  
  Given url "https://stardesk-itsm-ui-dev.myairports.com.my/addchange"
  Then username "bhanu"
  Then password "Test@321"
  #Then Click Submit button
  Then Click on incidents and click on Create New Ticket
  Then Select the role "<role>"
  Then Click the Next button in page
  Then Subject "<sub>"
  Then Enter description "<des>"
  Then Select Category "<cat>"
  Then Select Sub Category "<scat>"
  Then Select Item Category "<item>"
  Then Select location "<lo>"
  Then Click Submit button 
  And Check Success Popup is displayed.
  
    

    Examples: 
      |role|sub|des|cat|scat|item|lo|
      |Admin|test|test|CLIENT PC|CLIENT|SERVER|HQ|
