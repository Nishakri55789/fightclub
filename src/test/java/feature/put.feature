Feature: user is able to update the data in the database
@Putclub
  Scenario: user wants to put the data
    Given user is able to provide the data in database
    When user is able to put a data by using an api is "http://localhost:8080/members"
    Then user can validates statuscode is 201