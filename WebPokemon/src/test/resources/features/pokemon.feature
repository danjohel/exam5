Feature: Search Pokemon
  Scenario: Search Pokemon on Wikipedia via Google
    Given User open Google Home page
    When User input "Bulbasaur Wikipedia Indonesia" on google search bar
    And user hit enter
    Then User see google search page list
    Then User click on the first search result
    Then User go to Wikipedia Page
    And User see name "Bulbasaur"
    And User see number "#001"

  Scenario: Search Pokemon on Wikipedia via Google
    Given User open Google Home page
    When User input "Mewtwo Wikipedia Indonesia" on google search bar
    And user hit enter
    Then User see google search page list
    Then User click on the first search result
    Then User go to Wikipedia Page
    And User see name "Mewtwo"
    And User see number "#150"

  Scenario: Search Pokemon on Wikipedia via Google
    Given User open Google Home page
    When User input "Charizard Wikipedia Indonesia" on google search bar
    And user hit enter
    Then User see google search page list
    Then User click on the first search result
    Then User go to Wikipedia Page
    And User see name "Charizard"
    And User see number "#006"

  Scenario: Search Pokemon on Wikipedia via Google
    Given User open Google Home page
    When User input "Pikachu  Wikipedia Indonesia" on google search bar
    And user hit enter
    Then User see google search page list
    Then User click on the first search result
    Then User go to Wikipedia Page
    And User see name "Pikachu"
    And User see number "#025"