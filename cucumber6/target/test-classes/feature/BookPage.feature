Feature: Book the Adactin Hotel functionalities

 Scenario Outline: Book adactin HotelPage 
 And User should enter "<firstname>" , "<lastname>" , "<billingaddress>" , "<creditcardno>" , "<creditcardtype>" , "<expirydateMonth>" , "<expirydateyear>" ,"<cvvnumber>" 
 		Then User should click the Booknow button
 		
 		Examples:
 		| firstname  | lastname | billingaddress | creditcardno     | creditcardtype | expirydateMonth | expirydateyear | cvvnumber |
 		|  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		 | 2021           | 246       |