Feature: Search the Adactin Hotel functionalities

  Scenario Outline: Searching adactin Hotel details
    When User should Search the Hotels "<location>" , "<hotels>" , "<RoomType>"
    And User should click the Search button
	Examples:
	| location | hotels      | RoomType |
	| Sydney   | Hotel Creek | Double   | 