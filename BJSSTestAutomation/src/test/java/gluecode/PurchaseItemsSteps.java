package gluecode;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.ItemDetailsPagePO;

public class PurchaseItemsSteps {
	ItemDetailsPagePO objItemDetails;
	TestContext testContext;

	public PurchaseItemsSteps(TestContext context) {
		testContext = context;
		objItemDetails = testContext.getPageObjectManager().getItemDetailsPO();
	}

	@Given("^the users changes the \"([^\"]*)\" of the item to \"([^\"]*)\"$")
	public void the_user_selects_option(String option, String value) throws Throwable {
		objItemDetails.selectOption(option, value);
	}

	@When("^the user \"([^\"]*)\"$")
	public void the_user_selects_button(String button) throws Throwable {
		objItemDetails.selectsButton(button);
	}
}
