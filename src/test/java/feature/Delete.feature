Feature: a user is able to update the data in the database

  Scenario: a user wants to delete the data

    When a user is able to put a data by using an api is "http://localhost:8080/members"
    Then a user can validates statuscode is 201