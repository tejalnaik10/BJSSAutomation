package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrderHistoryPO {
	Select dropdown;
	WebDriver driver;
	By orderTable=By.xpath("//*[@id='order-list']/tbody/tr");
	By comment=By.xpath("//*[@id='sendOrderMessage']/p[3]/textarea");
	By sendButton=By.xpath("//*[@id='sendOrderMessage']/div/button/span");
	By messageTable=By.xpath("//*[@id='block-order-detail']/div[5]/table/tbody/tr/td");

	public OrderHistoryPO(WebDriver driver) {
		this.driver = driver;
	}

	public void selectOrder(String date) {
		List<WebElement> orders = driver.findElements(orderTable);
		System.out.println(orders.size());
		outerloop: for (int i = 0; i < orders.size(); i++) {
			List<WebElement> col = orders.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < col.size(); j++) {
				if (col.get(j).getText().equalsIgnoreCase(date)) {
					System.out.println(col.get(j).getText());
					col.get(--j).click();
					break outerloop;
				}
			}

		}
	}
	
	public void addComment(String commenttext){
		driver.findElement(comment).sendKeys(commenttext);
		driver.findElement(sendButton).click();
	}

	public void verifyComment(String commentttext) {
		Boolean commentFound=false;
		List<WebElement> messages=driver.findElements(messageTable);
		if(messages.size()>0){
			for(int i=0;i<messages.size();i++){
				if(messages.get(i).getText().equalsIgnoreCase(commentttext)){
					commentFound=true;
					break;
				}
			}
		}
			if(commentFound==true){
				System.out.println("Matching comment found");
			}else
			{
				System.out.println("No matching comment found");
			}
	}

}
