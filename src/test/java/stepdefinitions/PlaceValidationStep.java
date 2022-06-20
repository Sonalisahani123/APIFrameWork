package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceValidationStep {
	
	@Given("Add place payload")
	public void add_place_payload() {
	    
	}

	@When("user calls {string} with post Http request")
	public void user_calls_with_post_http_request(String string) {
	    	}

	@Then("the API call got success with  status code {int}")
	public void the_api_call_got_success_with_status_code(Integer int1) {
	   	}

	@Then("{string} in response body  is {string}")
	public void in_response_body_is(String string, String string2) {
	   
	}

	


}
