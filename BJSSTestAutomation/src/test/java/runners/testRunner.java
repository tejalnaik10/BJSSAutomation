package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "classpath:gluecode" },
plugin = {
		"pretty",
		"html:target/cucumber-html-default",
		"junit:target/cucumber-report.xml" },monochrome = true, tags={"@reviewPrevOrders"})
public class testRunner {
	

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}
}