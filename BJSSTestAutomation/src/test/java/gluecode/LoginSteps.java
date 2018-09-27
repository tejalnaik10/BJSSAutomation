package gluecode;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.LoginPO;

public class LoginSteps {
	LoginPO objLogin;
	TestContext testContext;

	public LoginSteps(TestContext context) {
		testContext = context;
		objLogin = testContext.getPageObjectManager().getLoginPO();
	}

	@When("^the user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enter_and_Password(String username, String password) throws Throwable {
		objLogin.loginToSite(username, password);
	}

	@When("^the user navigates to \"([^\"]*)\" page$")
	public void the_user_selects_option(String option) throws Throwable {
		objLogin.selectOption(option);
	}
}
