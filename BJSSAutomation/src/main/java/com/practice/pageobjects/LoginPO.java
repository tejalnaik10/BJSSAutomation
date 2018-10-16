package com.practice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPO {
	WebDriver driver;

	By username = By.id("email");
	By password = By.id("passwd");
	By signInbutton = By.id("SubmitLogin");
	By homebutton = By.xpath("//*[@id='center_column']/ul/li/a/span");

	public LoginPO(WebDriver driver) {
		this.driver = driver;
	}

	public void loginToSite(String strUserName, String strPassword) {
		driver.findElement(username).sendKeys(strUserName);
		driver.findElement(password).sendKeys(strPassword);
		driver.findElement(signInbutton).click();
	}

	public void verifyLogin() {
		// add assertion for successful login
	}

	public void selectOption(String option) {
		switch (option) {
		case "Home":
			driver.findElement(homebutton).click();
			break;
		}
	}
}
