package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Deletecucu {
	Response response ;
	ValidatableResponse val ;

	@When("a user is able to put a data by using an api is {string}")
	public void a_user_is_able_to_put_a_data_by_using_an_api_is(String url) {
		 response = RestAssured.get(url);
	}

	@Then("a user can validates statuscode is {int}")
	public void a_user_can_validates_statuscode_is(Integer int1) {
		  val = response.then();
		   val.assertThat().statusCode(int1).log().all();
	}

}
