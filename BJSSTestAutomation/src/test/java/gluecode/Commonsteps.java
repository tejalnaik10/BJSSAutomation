package gluecode;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import pageObjects.HomePagePO;
import pageObjects.LaunchingPagePO;

public class Commonsteps {
	LaunchingPagePO objLaunch;
	TestContext testContext;
	HomePagePO objHomePage;

	public Commonsteps(TestContext context) {
		testContext = context;
		objHomePage = testContext.getPageObjectManager().getHomePagePO();
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
}
