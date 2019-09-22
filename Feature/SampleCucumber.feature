Feature: navigation
@login
Scenario Outline: Scenario
    Given login to the application
    When enter "<Username>" and  "<Password>"
    And User enters "<Age>" and "<Class>" and "<Type>"
    But verify the login
    
    Examples:
    |Username  		|Password	|Age  |Class  |Type  |
    |Rahil  		|Pass1		|12   |5th    |Type11|		
    |Keval  		|Pass2		|25   |6th	  |Type22|
 

@login1
Scenario: CRM end-end flow
    Given CRM application is logged in
    When User creates a customer
    And User provides the documents 
    Then User can see it's information updated
