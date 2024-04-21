Feature: Search all jobs

  Scenario: Successfully return search results
    Given User Launch Chrome browser
    When user opens URL "https://risk.lexisnexis.co.uk/"
    When User click on About Us link
    When User click on Search All Jobs link
    When User enter Text as "automation tester" in the search box and click
    Then one or more search results should be returned
    And close browser







