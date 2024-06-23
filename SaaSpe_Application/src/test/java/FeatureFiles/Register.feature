
@tag
Feature: Registration for the application
  I want to use this template for my feature file

  @Valid
  Scenario Outline: User Registration Page
  
  Given Open the E-Commerce website with the url "https://naveenautomationlabs.com/opencart/"
  Then Click on the My Account link
  Then Click on the Register Button
  Then Enter the first name as "<first name>"
  Then Enter the last name as "<last name>"
  Then Enter user email address "<email>"
  Then Enter the user phone number "<phone>"
  Then Enter the user password as "<password>"
  Then Enter the confirm password as "<cpassword>"
  Then Click on the Checkbox
  And click on continue button 
  
   Examples: 
      |first name|last name|email|phone|password|cpassword|
			|Raghul|Ravi|zofixotaa@imagepoet.net|8935120547|Pass@123|Pass@123|
			|Raghul|Ravi|mofixotaa@imagepoet.net|8955120547|Pass@123|Pass@123|
			
			
			
