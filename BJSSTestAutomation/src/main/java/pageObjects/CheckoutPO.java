package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPO {
	WebDriver driver;
	By firstItemPrice = By.xpath("//*[@id='product_price_1_3_101365']/span");
	By secondItemPrice = By.xpath("//*[@id='product_price_2_7_101365']/span");
	By totalproducts = By.xpath("//*[@id='total_product']");
	By shipping = By.xpath("//*[@id='total_shipping']");
	By totalPrice = By.xpath("//*[@id='total_price']");
	By proceedCheckout = By.xpath("//*[@id='center_column']/p[2]/a[1]/span");
	By addressProceedCheckout = By.xpath("//*[@id='center_column']/form/p/button/span");
	By shippingProceedCheckout = By.xpath("//*[@id='form']/p/button/span");
	By termsCheckbox = By.xpath("//*[@id='cgv']");
	By payByWire = By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a");
	By confirmOrder = By.xpath("//*[@id='cart_navigation']/button/span");

	public CheckoutPO(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyOrderDetails() {

		double totalProducts = Double.parseDouble(getamount(driver.findElement(firstItemPrice)))
				+ Double.parseDouble(getamount(driver.findElement(secondItemPrice)));
		assertEquals(totalProducts, Double.parseDouble(getamount(driver.findElement(totalproducts))), 0.01);
		assertEquals(2.00, Double.parseDouble(getamount(driver.findElement(shipping))), 0.01);
		double total = totalProducts + Double.parseDouble(getamount(driver.findElement(shipping)));
		assertEquals(total, Double.parseDouble(getamount(driver.findElement(totalPrice))), 0.01);
	}

	private String getamount(WebElement findElement) {
		return findElement.getText().substring(1);
	}

	public void placeOrder() {
		driver.findElement(proceedCheckout).click();
		driver.findElement(addressProceedCheckout).click();
		driver.findElement(termsCheckbox).click();
		driver.findElement(shippingProceedCheckout).click();
		driver.findElement(payByWire).click();
		driver.findElement(confirmOrder).click();
	}

}
