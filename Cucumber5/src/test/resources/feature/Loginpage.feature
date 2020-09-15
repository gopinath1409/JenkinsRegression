Feature: Verifying the Adactin functionalities

  Scenario Outline: Verifying adactin login details with valid credentials
    Given User is on the adactin page
    When User should enter "<username>" and "<password>"
    And User should click the login button
    And User should verify msg
    And User should Search the Hotels "<location>" , "<hotels>" , "<RoomType>"
      | noofRooms      | adultperRooms | childrenperRoom |
      | 1 - One        | 1 - One       | 0 - None        |
      | 2 - Two        | 2 - Two       | 1 - One         |
      | 3 - Three      | 3 - Three     | 2 - Two         |
      | 4 - Four       | 4 - Four      | 3 - Three       |
      | 5 - Five       | 1 - One       | 4 - Four        |
      | 6 - Six        | 1 - One       | 0 - None        |
      | 7 - Seven      | 1 - One       | 0 - None        |
      | 8 - Eignt      | 1 - One       | 0 - None        |
      | 9 - Nine       | 1 - One       | 0 - None        |
      | 10 - Ten       | 1 - One       | 0 - None        |
      | Username       | Gopi          | Ram             |
      | Password       | Gopi@gmail    | Ram@gmail       |
      | Location       | Chennai       | Pondicherry     |
      | Rooms Type     | Luxury        | Normal          |
      | Payment Method | card          | online          |
      | Card Type      | Master        | Visa            |
      | Booking Day    | Weekdays      | WeekEnd         |
      | online payment | Netbanking    | Gpay Wallet     |
    And User should click the Search button
    And User should Select the Radio button
    And User should click the Continue button
    And User should enter "<firstname>" , "<lastname>" , "<billingaddress>" , "<creditcardno>" , "<expirydateMonth>" , "<expirydateyear>" ,"<cvvnumber>"
      | creditcardtype   |
      | American Express |
      | VISA             |
      | Master Card      |
      | Other            |
    And User should click the Booknow button

    Examples: 
      | username     | password     | location | hotels      | RoomType | firstname | lastname | billingaddress | creditcardno     | expirydateMonth | expirydateyear | cvvnumber |
      | gopigopigopi | gopigopigopi | Sydney   | Hotel Creek | Double   | Gopi      | Nath     | Ambattur       | 1587469831547456 | January         |           2021 |       246 |
