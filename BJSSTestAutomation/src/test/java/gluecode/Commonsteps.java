package gluecode;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePagePO;
import pageObjects.LaunchingPagePO;
import pageObjects.LoginPO;

public class Commonsteps {
	LoginPO objLogin;
	LaunchingPagePO objLaunch;
	TestContext testContext;
	HomePagePO objHomePage;

	public Commonsteps(TestContext context) {
		testContext = context;
		objHomePage = testContext.getPageObjectManager().getHomePagePO();
		objLogin = testContext.getPageObjectManager().getLoginPO();
		objLaunch = testContext.getPageObjectManager().getLaunchingPagePO();
	}

	@Given("^a user is on \"([^\"]*)\" page$")
	public void a_user_is_on_login_page(String pageName) throws Throwable {
		if (pageName.equalsIgnoreCase("Automation practice")) {
			objLaunch.navigateTo_LaunchingScreen();
		}
	}

	@Given("^the user selects \"([^\"]*)\"$")
	public void the_user_selects_option(String option) throws Throwable {
		objHomePage.selectOption(option);

	}
	
	@When("^the user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enter_and_Password(String username, String password) throws Throwable {
		objLogin.loginToSite(username, password);
	}

	@When("^the user navigates to \"([^\"]*)\" page$")
	public void the_user_navigates_to_page(String option) throws Throwable {
		objLogin.selectOption(option);
	}
}
