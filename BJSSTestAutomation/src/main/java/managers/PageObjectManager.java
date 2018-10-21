package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CheckoutPO;
import pageObjects.HomePagePO;
import pageObjects.ItemDetailsPagePO;
import pageObjects.LaunchingPagePO;
import pageObjects.LoginPO;
import pageObjects.MyAccountPO;
import pageObjects.OrderHistoryPO;

public class PageObjectManager {

	private WebDriver driver;
	private LoginPO objLogin;
	private HomePagePO objHomePage;
	private ItemDetailsPagePO objItemDetails;
	private LaunchingPagePO objlaunch;
	private CheckoutPO objCartSummary;
	private MyAccountPO objMyAccount;
	private OrderHistoryPO objOrderHistory;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public MyAccountPO getMyAccountPO() {
		return (objMyAccount == null) ? objMyAccount = new MyAccountPO(driver) : objMyAccount;
	}
	
	public LoginPO getLoginPO() {
		return (objLogin == null) ? objLogin = new LoginPO(driver) : objLogin;
	}

	public HomePagePO getHomePagePO() {
		return (objHomePage == null) ? objHomePage = new HomePagePO(driver) : objHomePage;
	}

	public ItemDetailsPagePO getItemDetailsPO() {
		return (objItemDetails == null) ? objItemDetails = new ItemDetailsPagePO(driver) : objItemDetails;
	}

	public CheckoutPO getCartSummaryPO() {
		return (objCartSummary == null) ? objCartSummary = new CheckoutPO(driver) : objCartSummary;
	}

	public LaunchingPagePO getLaunchingPagePO() {
		return (objlaunch == null) ? objlaunch = new LaunchingPagePO(driver) : objlaunch;
	}
	
	public OrderHistoryPO getOrderHistoryPO() {
		return (objOrderHistory == null) ? objOrderHistory = new OrderHistoryPO(driver) : objOrderHistory;
	}

}
