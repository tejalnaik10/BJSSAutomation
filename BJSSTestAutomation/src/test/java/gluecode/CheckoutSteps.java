package gluecode;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pageObjects.CheckoutPO;

public class CheckoutSteps {
	CheckoutPO objCartSummary;
	TestContext testContext;

	public CheckoutSteps(TestContext context) {
		testContext = context;
		objCartSummary = testContext.getPageObjectManager().getCartSummaryPO();
	}

	@Then("^the user verifies the order details$")
	public void the_user_verifies_the_order_details() throws Throwable {
		objCartSummary.verifyOrderDetails();
	}

	@Then("^the user places the order$")
	public void the_user_places_the_order() throws Throwable {
		objCartSummary.placeOrder();
	}
}
