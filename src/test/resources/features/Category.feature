Feature: Category API

  Scenario: User requests a category
    When the client calls /getCategory
    Then the client receives status code of 200 for category
    And the client receives category with name