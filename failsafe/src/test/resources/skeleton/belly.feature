Feature: Belly

  Scenario: a few cukes
    Given I have 2 cukes in my belly
    When I wait 1 hour
    Then my belly should growl


  Scenario: a few more cukes
    Given I have 4 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

  Scenario: a large number of cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl