
@tag
Feature: Change Password
  This feature is to verify the change password of the user.

 

  @tag2
  Scenario Outline: Change Password of the user in the application.
    Given Open the application with the url "https://dev-app.saaspe.com"
    Then I enter the username as "<user name>"
    Then I enter the password as "<password>"
    Then I click on the login button in the page
    Then Click on the user information button
    Then Click on the change password
    Then Enter the old password "<old password>"
    Then Enter the new password "<new passowrd>"
    Then Enter the confirm password "<confirm password>"
    And Click on the change password button

    Examples: 
      |user name|password|old password|new password|confirm password|
			|manoj.km@mind-graph.com|P@ssword-1|P@ssword-1|P@ssword-12|P@ssword-12|