Feature: Project with Database

  Background:

    Given Navigate to ebay

  Scenario: with database
    Then Search a value und click with DataBase as query   "select * from product"

  Scenario: with database and column Count
    Then Search a value und click with DataBase as query   "select * from product" as column "1" as row "2"