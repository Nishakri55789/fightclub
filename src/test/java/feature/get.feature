Feature: Get all Data 

  Scenario: User Wants to get the data from database
    When User Able to Retrive data by using URL "http://localhost:8080/fightclubs"
    Then user validate the status code is 200