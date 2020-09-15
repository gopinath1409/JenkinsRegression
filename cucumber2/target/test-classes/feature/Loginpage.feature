Feature: Verifying the Adactin functionalities

 Scenario Outline: Verifying adactin login details with valid credentials
 		Given User is on the adactin page
 		When User should enter "<username>" and "<password>"
 		And User should click the login button
 		Then User should verify msg
 		
 		Examples:
		| username     | password   	|  
		|	gopigopigopi | gopigopigopi |   
	
																			
 		
 		 
 		 