Feature: Google Search
  Agile : User search Car list on google.


@smoke_test
  Scenario Outline:
    Given User is on landing page_for_car
    When User types "<Cars>" listOfCar

    Then User see "<Car Titles>"resultsOfCarTitle

    Examples:
      | Cars     | Car Titles               |
      | BMW      | BMW - Google Search      |
      | Honda    | Honda - Google Search    |
      | Toyota   | Toyota - Google Search   |
      | Mercedes | Mercedes - Google Search |
      | Audi     | Audi - Google Search     |
