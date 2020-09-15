Feature: Book the Adactin hotel functionalities

 Scenario Outline: Book adactin hotel 
 	Given: User should enter "<firstname>" , "<lastname>" , "<billingaddress>" , "<creditcardno>" , "<creditcardtype>" , "<expirydateMonth>" , "<expirydateyear>" ,"<cvvnumber>" 
 	Then: User should click the Booknow button
 	
 	Examples: 
 	
 	| firstname  | lastname | billingaddress | creditcardno     | creditcardtype | expirydateMonth | expirydateyear | cvvnumber |
 	|  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		 | 2021           | 246       |