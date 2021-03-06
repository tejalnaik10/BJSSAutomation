package pageObjects;

import org.openqa.selenium.WebDriver;

import managers.FileReaderManager;

public class LaunchingPagePO {
	WebDriver driver;

	public LaunchingPagePO(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateTo_LaunchingScreen() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		System.out.println("You are on Your Logo Page");
	}

}
