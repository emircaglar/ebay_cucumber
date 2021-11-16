Feature: Auto suchen bei Ebay

  Background:
    When Navigate to ebay
    Then User should login successfully

    Scenario: Auto suchen
      Then User click auto categories


