package gluecode;

import org.testng.annotations.BeforeMethod;

import cucumber.TestContext;

public class Hooks {
	TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@BeforeMethod
	public void BeforeSteps() {
		/*
		 * add steps to perform before test
		 */
	}

	/*
	 * @After public void AfterSteps() {
	 * testContext.getWebDriverManager().closeDriver(); }
	 */

}
