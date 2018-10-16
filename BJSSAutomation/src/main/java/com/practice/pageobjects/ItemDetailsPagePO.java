package com.practice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ItemDetailsPagePO {

	Select dropdown;
	WebDriver driver;
	By size = By.xpath("//*[@id='group_1']");
	By addToCart = By.xpath("//*[@id='add_to_cart']/button/span");
	By continueShopping = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span");
	By proceedToCheckout = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");

	public ItemDetailsPagePO(WebDriver driver) {
		this.driver = driver;
	}

	public void selectOption(String option, String value) throws Throwable {
		driver.switchTo().frame(3);
		switch (option) {
		case "Size":
			dropdown = new Select(driver.findElement(size));
			dropdown.selectByVisibleText(value);
			break;
		}
		driver.switchTo().parentFrame();
	}

	public void selectsButton(String button) throws Throwable {
		driver.switchTo().frame(3);
		Thread.sleep(2000);
		switch (button) {
		case "Adds to cart":
			driver.findElement(addToCart).click();
			// getItemDetails();
			break;
		case "Continues shopping":
			driver.findElement(continueShopping).click();
			break;
		case "Proceeds to checkout":
			driver.findElement(proceedToCheckout).click();
			break;
		}
		driver.switchTo().parentFrame();

	}

}
