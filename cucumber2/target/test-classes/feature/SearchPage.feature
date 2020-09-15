Feature: Searching the Adactin hotel functionalities

 Scenario Outline: Searching adactin hotel details with valid credentials
 		Given: User should Search the Hotels "<location>" , "<hotels>" , "<RoomType>" ,"<Number of Rooms>","<Adults per room>" and "<Children per room>"
 		When: User should click the Search button
 		
 		
 		Examples: 
 		| location | hotels      | RoomType | Number of Rooms | Adults per room | Children per room |
 		| Sydney   | Hotel Creek | Standard | 1-One           | 1-One 					| 1-One 						| 