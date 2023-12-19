package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ShopPage extends BasePage {
	
	public ShopPage(WebDriver driver) {
		super(driver);

	}
	private String shopPageTitle = "Products – Automation Practice Site";
	private String androidPageTitle = "Android - Automation Practice Site";
	private By linkAndroid = By.xpath("//ul[@class='product-categories']//li[@class='cat-item cat-item-24']//a[text()='Android']");
	private By btnReadMore = By.xpath("//*[text()='Read more']");
	
	public boolean shopPageIsDisplayed() throws Exception {
		return this.getTitle().equals(shopPageTitle);
		}
	
	public void clickOnLinkAndroid() throws Exception {
		this.click(linkAndroid);
		}
	
	public boolean btnReadMoreIsDisplayed() throws Exception {
		return this.isDisplayed(btnReadMore);
	}
	
	public boolean androidPageIsDisplayed() throws Exception {
		return this.getTitle().equals(androidPageTitle);
		}
	
	
	

}
