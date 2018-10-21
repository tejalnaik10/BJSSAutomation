package gluecode;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CheckoutPO;
import pageObjects.ItemDetailsPagePO;

public class Test1_PurchaseItemsSteps {
	ItemDetailsPagePO objItemDetails;
	CheckoutPO objCartSummary;
	TestContext testContext;

	public Test1_PurchaseItemsSteps(TestContext context) {
		testContext = context;
		objItemDetails = testContext.getPageObjectManager().getItemDetailsPO();
		objCartSummary = testContext.getPageObjectManager().getCartSummaryPO();
	}

	@Given("^the users changes the \"([^\"]*)\" of the item to \"([^\"]*)\"$")
	public void the_user_selects_option(String option, String value) throws Throwable {
		objItemDetails.selectOption(option, value);
	}

	@When("^the user \"([^\"]*)\"$")
	public void the_user_selects_button(String button) throws Throwable {
		objItemDetails.selectsButton(button);
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
