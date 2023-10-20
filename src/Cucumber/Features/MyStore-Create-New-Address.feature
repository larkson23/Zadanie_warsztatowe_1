Feature: Adding new address

  Scenario Outline: User can add new address
    Given an open browser with https://mystore-testlab.coderslab.pl
    When User clicked Sign In
    And User log in with <email> <password>
    And User clicked Addresses
    And User clicked Create new address
    And Form is fulfilled with data <alias> <address> <city> <zippostalcode> <phone>
    Then It is checked whether the address has been added <alias> <address> <city> <zippostalcode> <phone>

    Examples:
      | alias  | address |   city    | zippostalcode |  phone  |   email   | password |
      | Johnny |  2137   | Krakszawa |     420    | 0700880 | Janusz@Dzban | 12345 |