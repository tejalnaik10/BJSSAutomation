package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPO {
	WebDriver driver;
	By orderHistory=By.xpath("//*[@id='center_column']/div/div[1]/ul/li[1]/a/span");

	public MyAccountPO(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectsButton(String button) throws Throwable {
		switch (button) {
		case "order history and details":
			driver.findElement(orderHistory).click();
			// getItemDetails();
			break;
/*		case "Continues shopping":
			driver.findElement(continueShopping).click();
			break;
		case "Proceeds to checkout":
			driver.findElement(proceedToCheckout).click();
			break;*/
		}
	}


}
