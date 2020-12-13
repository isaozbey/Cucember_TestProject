Feature: Google Search
  Agile : User search fruit list on google.

  Scenario Outline:
    Given User is on landing page
    When User types "<fruit>" list

    Then User see "<title>"results

    Examples:
      | fruit      | title                      |
      | orange     | orange - Google Search     |
      | apple      | apple - Google Search      |
      | watermelon | watermelon - Google Search |
      | lemon      | lemon - Google Search      |
      | grape      | grape - Google Search      |
