package stepdefination;

import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class postcucu {
	
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@Given("to provide data we use given")
	public void to_provide_data_we_use_given() {
		JSONObject obj = new JSONObject();
		   obj.put("id","15" );
			obj.put("address","btm");
			obj.put("description","hello");
			obj.put("leader","kempeda");
			obj.put("name","nihal");
			obj.put("ranking","88");
		  req=RestAssured.given();
		  req.body(obj);
		  req.contentType(ContentType.JSON);
	}
	@When("to hit the server and get the response by using API {string}")
	public void to_hit_the_server_and_get_the_response_by_using_api(String url) {
		res = req.post(url);
	}
	@Then("user is validating the status code is {int}")
	public void user_is_validating_the_status_code_is(Integer int1) {
		 validate = res.then();
		   validate.assertThat().statusCode(int1).log().all();
	}


}