#Sample Feature Definition Template
@tag
Feature: Test Github Login

  @tag1
  Scenario: Login to Gitub page
    Given Github page is launched
    And login is visible
    When User Enter user_name and passowrd in login form
    And click login button
    Then Login should be success
