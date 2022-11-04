package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Getcucu {
	Response response ;
	ValidatableResponse val;
	
	@When("User Able to Retrive data by using URL {string}")
	public void user_able_to_retrive_data_by_using_url(String url) {
		   Object response = RestAssured.get(url);
		
	}

	@Then("user validate the status code is {int}")
	public void user_validate_the_status_code_is(Integer int1) {
		  val = response.then();
		   val.assertThat().statusCode(int1).log().all();
	   
	}
}
