package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class MyAccountPage extends BasePage{
	
	private String myAccountPageTitle = "My Account – Automation Practice Site";
	
	private By labelLogin = By.xpath("//*[text()='Login']");
	private By textEmail = By.xpath("//form[@class='login']//p[@class='woocommerce-FormRow woocommerce-FormRow--wide form-row form-row-wide']//input[@id='username']");
	private By textPassword = By.xpath("//form[@class='login']//p[@class='woocommerce-FormRow woocommerce-FormRow--wide form-row form-row-wide']//input[@id='password']");
	private By btnLogin = By.xpath("//*[@name=\"login\"]");
	private By regEmail = By.xpath("//form[@class='register']//p[@class='woocommerce-FormRow woocommerce-FormRow--wide form-row form-row-wide']//input[@id='reg_email']");
	private By regPassword = By.xpath("//form[@class='register']//p[@class='woocommerce-FormRow woocommerce-FormRow--wide form-row form-row-wide']//input[@id='reg_password']");
	private By btnRegister = By.xpath("//*[@name=\"register\"]");
	private By labelPassword = By.xpath("//form[@class='register']//p[@class='woocommerce-FormRow woocommerce-FormRow--wide form-row form-row-wide']//label[@for='reg_password']");
	private By labelErrorRegister = By.xpath("//*[text()=' Please provide a valid email address.']");
	
		
	public MyAccountPage(WebDriver driver) {
			super(driver);
		}
			
	
	
	public boolean myAccountPageIsDisplayed() throws Exception {
		return this.getTitle().equals(myAccountPageTitle);
		}
		
	public void typeEmail(String validEmail) throws Exception {
		this.sendKeys(textEmail, validEmail);
		}
		
	public void typePassword(String validPassword) throws Exception {
		this.sendKeys(textPassword, validPassword);
		}	
	
	public void clickOnLoginButton() throws Exception {
		this.click(btnLogin);
		}
	
	public void clickOnRegEmail() throws Exception {
		this.click(regEmail);
		}

	public boolean typeEmailIsDisplayed() throws Exception {
		return this.isDisplayed(textEmail);
	}

	public void typeRegEmail(String invalidEmail) throws Exception {
		this.sendKeys(regEmail, invalidEmail);
		}
	
	public void typeRegPassword(String invalidPassword) throws Exception {
		this.sendKeys(regPassword, invalidPassword);
		}	
	
	
	public void clickOnLabelPassword() throws Exception {
		this.click(labelPassword);
		}
	
	
	public void clickOnRegisterButton() throws Exception {
		this.click(btnRegister);
		}

	public String regEmailGetAttribute() throws Exception {
		return this.getAttribute(regEmail, "validationMessage");
	}
	
	public boolean labelErrorRegisterIsDsiaplyed() throws Exception {
		return this.isDisplayed(labelErrorRegister);
	}
	


}


