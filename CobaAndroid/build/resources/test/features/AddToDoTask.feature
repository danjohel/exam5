Feature: Add to do task
  Scenario: add task
    Given User is on to do list page
    When User click on add task button
    Then User input title "Note1"
    And User input description "isi note1"
    And User click on add button
    Then User see title "Note1" on to do list page

  Scenario: check / complete todo
    Given User is on to do list page
    When User click on add task button
    Then User input title "Note1"
    And User input description "isi note1"
    And User click on add button
    Then User see title "Note1" on to do list page
    When User click on checkbox
    Then User see checkbox is checked

  Scenario: uncheck todo
    Given User is on to do list page
    When User click on add task button
    Then User input title "Note1"
    And User input description "isi note1"
    And User click on add button
    Then User see title "Note1" on to do list page
    When User click on checkbox
    Then User see checkbox is checked
    When User click on checkbox
    Then User see checkbox is unchecked

  Scenario: filter todo Active only
    Given User is on to do list page
    When User click on add task button
    Then User input title "Note1"
    And User input description "isi note1"
    And User click on add button
    Then User see title "Note1" on to do list page
    When User click on filter button
    Then User see menu of filter button
    When User click on Active
    Then User see "Note1" on Active todo

  Scenario: filter todo Completed only
    Given User is on to do list page
    When User click on add task button
    Then User input title "Note1"
    And User input description "isi note1"
    And User click on add button
    Then User see title "Note1" on to do list page
    And User click on checkbox
    When User click on filter button
    Then User see menu of filter button
    When User click on Complete Button
    Then User see "Note1" on Complete todo

  Scenario: refresh add todo homepage
    Given User is on to do list page
    When User click on more options
    Then User see more options menu
    When User click on Refresh button
    Then User is on to do list page

  Scenario: Clear Completed todo list
    Given User is on to do list page
    When User click on add task button
    Then User input title "Note1"
    And User input description "isi note1"
    And User click on add button
    Then User see title "Note1" on to do list page
    And User click on checkbox
    When User click on more options
    Then User see more options menu
    When User click on Clear Completed button
  @jalan
  Scenario: See Statistic todo list
    Given User is on to do list page
    When User click on Navigate button
    Then User see menu of Navigate button
    When User click on Statistics
    Then User see Statistic view
