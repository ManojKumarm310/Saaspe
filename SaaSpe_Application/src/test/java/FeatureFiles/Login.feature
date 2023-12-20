@smoke
Feature: OrangeHRM Login Page.
  To test the login page of the OrageHRM application

  @tag
  Scenario: Login the application with the valid data
    Given I will open the application with the url "http://orangehrm.qedgetech.com/"
    When I enter the username "Admin"
    And I enter the password "Qedge123!@#"
    And I click the login button
    And I will click on the Welcome link
    And I will click on the logout button
    Then I will close the browser
    
    @tag2
  Scenario Outline: Login the application with Invalid data
    Given I will open the application with the url "http://orangehrm.qedgetech.com/"
    When I enter the username "<username>"
    And I enter the password "<password>"
    And I click the login button
		Then I will close the browser
		
    Examples: 
     |username|password|
    |Admin|1235|
    |asdf|poiu|
    |0986|qwer|    
