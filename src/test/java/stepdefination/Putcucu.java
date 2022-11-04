package stepdefination;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Putcucu {
	RequestSpecification req;
	Response res;
	ValidatableResponse val;
	ValidatableResponse validate;
	@Given("user wants to provide the data in the database")
	public void user_wants_to_provide_the_data_in_the_database() {
		
		
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
	
	@Given("user is able to provide the data in database")
	public void user_is_able_to_provide_the_data_in_database() {
	    
	}

	@When("user is able to put a data by using an api is {string}")
	public void user_is_able_to_put_a_data_by_using_an_api_is(String string) {
		res=req.post(string);
	    
	}

	@Then("user can validates statuscode is {int}")
	public void user_can_validates_statuscode_is(Integer int1) {
		 val = res.then();
		   val.assertThat().statusCode(int1).log().all();
	   
	}

}
