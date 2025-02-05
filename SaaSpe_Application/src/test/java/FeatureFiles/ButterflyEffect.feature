
@tag
Feature: Butterfly Effect
  

 

  @tag2
  Scenario Outline: Automation of Butterfly effect
    Given url of butterfly effect
    Then Click on the Booking Service tab
    Then Click on the View More button of butterfly effect
    Then Click on the here link
    Then Select the Airport "<airport>"
    Then Enter the full Name "<fname>"
    Then Enter the Airlines "<airlines>"
    Then Enter the passport number "<passport>"
    Then Enter flight number "<flight>"
    Then Select passport issuing country "<icountry>"
    Then Enter date of visit "<dov>"
    Then Enter the contact number "<contact no>"
    Then Enter guardian full name "<gname>"
    Then Enter address 1 "<add 1>"
    Then Enter guardian passport number "<gpassport>"
    Then Enter address 2 "<add 2>"
    Then select the gender "<gender>"
    Then enter nric "<nric>"
    Then Enter city and postal code "<city>" "<pcode>"
    Then Enter Age "<age>"
    Then Select the country
    Then Enter email address "<email>"
    And Click on the check boxes

    Examples: 
     |airport|fname|airlines|passport|flight|icountry|dov|contact no|gname|add 1|gpassport|add 2|gender|nric|city|pcode|age|email|
	|KLIA Terminal 2|Ramesh|Srilanken Airlines|Aj 673|71036|Afghanistan|22-02-2025|8888877777|Monish|Chennai|202403|Tamil Nadu|Male|singapore|Mumbai|600001|37|test@gmail.com|