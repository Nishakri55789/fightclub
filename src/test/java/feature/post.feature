Feature: user is able to give the data
@PostClubSpark
Scenario: user is able to give the data
Given to provide data we use given
When to hit the server and get the response by using API "http://localhost:8080/fightclubs"
Then user is validating the status code is 201
