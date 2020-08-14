package atdd.benz;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.*;

public class FoodSteps extends TestCase {
	String userName, foodItem;
	int qty;
	@Given("^\"([^\"]*)\" wants to order \"([^\"]*)\"$")
	public void wants_to_order(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		userName = arg1;
		foodItem = arg2;
	}

	@Given("^select qty as (\\d+)$")
	public void select_qty_as(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    qty = arg1;
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^system display new button \"([^\"]*)\"$")
	public void system_display_new_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		AddToCart addToCart = new AddToCart();
		assertEquals(arg1, addToCart.process(userName, foodItem, qty));
		
	}

	@Then("^also display total amount as \"([^\"]*)\"$")
	public void also_display_total_amount_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^system display new message \"([^\"]*)\"$")
	public void system_display_new_message(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}


}
