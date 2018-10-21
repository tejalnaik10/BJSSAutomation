package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "gluecode", plugin = { "pretty",
		"junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports" }, monochrome = true, tags = {
				"@captureImage" })
public class testRunner {

	@AfterClass
	public static void writeExtentReport() {
		// Reporter.loadXMLConfig(new
		// File("src/test/resources/extent-config.xml"));
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}
}