package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetByNamecucu {
	Response response ;
	ValidatableResponse val;
	@When("User Ables to Retrive data by using URL {string}")
	public void user_ables_to_retrive_data_by_using_url(String url) {
		Object response = RestAssured.get(url);
	    
	}

	@Then("user validates the status code is {int}")
	public void user_validates_the_status_code_is(Integer int1) {
		val = response.then();
		   val.assertThat().statusCode(int1).log().all();
	    
	}


}
