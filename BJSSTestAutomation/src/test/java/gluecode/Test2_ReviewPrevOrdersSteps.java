package gluecode;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.MyAccountPO;
import pageObjects.OrderHistoryPO;

public class Test2_ReviewPrevOrdersSteps {
	MyAccountPO objMyAccount;
	OrderHistoryPO objOrderHistory;
	TestContext testContext;

	public Test2_ReviewPrevOrdersSteps(TestContext context) {
		testContext = context;
		objMyAccount = testContext.getPageObjectManager().getMyAccountPO();
		objOrderHistory=testContext.getPageObjectManager().getOrderHistoryPO();
	}
	
	@When("^the user views \"([^\"]*)\"$")
	public void the_users_views(String button) throws Throwable {
		objMyAccount.selectsButton(button);
	}
	
	@When("^the user selects an \"([^\"]*)\" by date$")
	public void the_user_selects_an_by_date(String orderDate) throws Throwable {
		objOrderHistory.selectOrder(orderDate);
	}
	
	@When("^the user adds a \"([^\"]*)\" on the order$")
	public void the_users_adds_comment_on_the_order(String comment) throws Throwable {
		objOrderHistory.addComment(comment);
	}
	
	@When("^the user verifies the \"([^\"]*)\"$")
	public void the_users_verifies_comment(String comment) throws Throwable {
		objOrderHistory.verifyComment(comment);
	}


}
