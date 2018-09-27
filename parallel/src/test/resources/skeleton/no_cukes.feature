Feature: No cukes

  Scenario: no cukes for my belly
    Given I have 0 cukes in my belly
    When I wait 1 hour
    Then my belly should growl