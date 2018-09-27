package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "src/test/java/gluecode" }, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" }, monochrome = true, tags = {
				"@purchaseItems" })
public class testRunner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}
}