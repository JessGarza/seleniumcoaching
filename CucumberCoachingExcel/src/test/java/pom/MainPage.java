package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage{
	
	private WebDriver driver;

	private String titleMainPage = "Automation Practice Site";
	private By btnMyAccount = By.xpath("//*[text()=\"My Account\"]");
	private By adIframe1 = By.xpath("//ins[@class='adsbygoogle adsbygoogle-noablate']//div[@id='aswift_7_host']//iframe[@id='aswift_7']");
	private By adIframe2 = By.xpath("//div[@id='ad_position_box']//div[@id='card']//div[@class='creative']//iframe[@id='ad_iframe']");
	private By btnClose = By.xpath("//div[@id='dismiss-button']");
	private By attachments = By.xpath("//*[@class='woocommerce-LoopProduct-link']");
	
	
		public MainPage(WebDriver driver) {
		super(driver);
	}
		
	public void validateResults() {
	
		}
		

	public void clickOnMyAccountButton() throws Exception {
	this.click(btnMyAccount);
			}
		
		
	public boolean mainPageIsDisplayed() throws Exception {
		return this.getTitle().equals(titleMainPage);
		}

	public boolean frameisDisplayed() throws Exception {
		return this.isDisplayed(adIframe1);
	}
	
	public void selectFrame() throws Exception {
		this.selectFrame(0);
		this.selectFrame(1);
		Thread.sleep(3000);
		this.click(btnClose);
	}
	
	public void clickClose() throws Exception {
		this.click(btnClose);
	}
	
	public void returnDefaultContent() {
		this.returnDefaultContent();
	}
	
	public boolean btnMyAccountIsDsiaplyed() throws Exception {
		return this.isDisplayed(btnMyAccount);
	}
	
	
}
