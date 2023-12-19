package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class OrdersPage extends BasePage{

	public OrdersPage(WebDriver driver) {
		super(driver);
		
	}
	
	private By linkOrders = By.xpath("//*[text()='Orders']");
	private By goShop = By.xpath("//*[@class='woocommerce-Button button']");		
			
	
	public void clickOnLinkOrders() throws Exception {
		this.click(linkOrders);
	}
	
	public boolean goShopIsDisplayed() throws Exception {
		return this.isDisplayed(goShop);
		}
	
}
