Feature: Verifying the Adactin functionalities

 Scenario Outline: Verifying adactin login details with valid credentials
 		Given User is on the adactin page
 		When User should enter "<username>" and "<password>"
 		And User should click the login button
 		And User should verify msg
 		And User should Search the Hotels "<location>" , "<hotels>" , "<RoomType>" 
 		And User should click the Search button
 		And User should Select the Radio button
 		And User should click the Continue button
 		And User should enter "<firstname>" , "<lastname>" , "<billingaddress>" , "<creditcardno>" , "<creditcardtype>" , "<expirydateMonth>" , "<expirydateyear>" ,"<cvvnumber>" 
 		Then User should click the Booknow button
 		Examples:
		| username     | password     | location | hotels      | RoomType | firstname  | lastname | billingaddress | creditcardno     | creditcardtype | expirydateMonth | expirydateyear | cvvnumber |
		|	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Double   |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		 | 2021           | 246       |
	
		
	