package gluecode;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.OrderHistoryPO;

public class Test3_CaptureImageSteps {
	OrderHistoryPO objOrderHistory;
	TestContext testContext;

	public Test3_CaptureImageSteps(TestContext context) {
		testContext = context;
		objOrderHistory=testContext.getPageObjectManager().getOrderHistoryPO();
	}
	
	@When("^the users confirms that the dress \"([^\"]*)\" is \"([^\"]*)\"$")
	public void the_user_selects_an_by_date(String dressRef, String dressDetails) throws Throwable {
		
	}
}
