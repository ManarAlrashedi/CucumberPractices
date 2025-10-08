@smoke
Feature: Arithmetic operations
  As a user
  I want to perform arithmetic operations
  So that I can verify correct results are displayed

  @positive
  Scenario: Addition of two positive numbers
    Given I open the calculator page
    When I press 3 plus 3 and calculate
    Then the result should contain "6"

  @negative
  Scenario: Subtraction resulting in a negative number
    Given I open the calculator page
    When I press 3 minus 5 and calculate
    Then the result should contain "-2"

  @negative
  Scenario: Division by zero (error case)
    Given I open the calculator page
    When I press 4 divided by 0 and calculate
    Then an error message should appear