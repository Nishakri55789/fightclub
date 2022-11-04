Feature: Get all Data 

  Scenario: User Want to get the data from database
    When User Ables to Retrive data by using URL "http://localhost:8080/fightclubs"
    Then user validates the status code is 200