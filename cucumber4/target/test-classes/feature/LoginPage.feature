Feature: Verifying the Adactin functionalities

 Scenario Outline: Verifying adactin login details with valid credentials
 		Given User is on the adactin page
 		When User should enter "<username>" and "<password>"
 		And User should click the login button
 		And User should verify msg
 		And User should Search the Hotels "<location>" , "<hotels>" , "<RoomType>", "<noofRooms>", "<adultsperRoom>","<childrenperRoom>"
 		And User should click the Search button
 		And User should Select the Radio button
 		And User should click the Continue button
 		And User should enter "<firstname>" , "<lastname>" , "<billingaddress>" , "<creditcardno>" , "<creditcardtype>" , "<expirydateMonth>" , "<expirydateyear>" ,"<cvvnumber>" 
 		Then User should click the Booknow button
 		Examples:
		| username     | password     | location | hotels      | RoomType    |  noofRooms     | adultperRoom | childrenperRoom | firstname  | lastname | billingaddress | creditcardno     | creditcardtype | expirydateMonth | expirydateyear  | cvvnumber |
		|	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Standard    |  1 - One       | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    	  	| 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Double      |  1 - One       | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Deluxe      |  1 - One    	  | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  2 - Two       | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  3 - Three     | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  4 - Four      | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  5 - Five      | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  6 - Six       | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  7 - Seven     | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  8 - Eight     | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  9 - Nine      | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  10 - Ten      | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 2 - Two      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 3 - Three    | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 4 - Four     | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 1 - One      | 0 - None        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 1 - One      | 1 - One         |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 1 - One      | 2 - Two         |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 1 - One      | 3 - Three       |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 1 - One      | 4 - Four        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 1 - One      | 5 - Five        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 1 - One      | 5 - Five        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | VISA           | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 1 - One      | 5 - Five        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | Other          | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 1 - One      | 5 - Five        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | Master Card    | January    		  | 2021            | 246       |
	  |	gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Super Deluxe|  1 - One       | 1 - One      | 5 - Five        |  Gopi      | Nath     | Ambattur       | 1587469831547456 | American Express| January    		  | 2021            | 246       |
	  
	  

	  

	 