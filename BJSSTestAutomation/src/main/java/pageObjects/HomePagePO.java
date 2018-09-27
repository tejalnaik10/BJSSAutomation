package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePagePO {
	WebDriver driver;
	By signIn = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
	By firstItem = By.xpath("//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img");
	By secondItem = By.xpath("//*[@id='homefeatured']/li[2]/div/div[1]/div/a[1]/img");
	By signOut = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");

	public HomePagePO(WebDriver driver) {
		this.driver = driver;
	}

	public void selectOption(String option) throws Throwable {
		switch (option) {
		case "signIn":
			driver.findElement(signIn).click();
			break;
		case "firstItem":
			driver.findElement(firstItem).click();
			break;
		case "secondItem":
			driver.findElement(secondItem).click();
			break;
		case "signOut":
			driver.findElement(signOut).click();
			break;
		}

	}

}
