package pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HelloPage extends BasePage{

	//private String titlePageone = "My Account - Automation Practice Site";
	private String label_signout = "Sign out";
	private By label_signout_locator = By.xpath("//*[text()=\"Sign out\"]");

		//public String getTitlePageone() {
		//	return titlePageone;
		//}
		
		//public By getLabelSignoutLocator() {
		//	return label_signout_locator;
		//}
	
		
		public HelloPage(WebDriver driver) {
			super(driver);
			}
		
		public boolean helloPageisDisplayed() throws Exception {
			return this.isDisplayed(label_signout_locator) && this.getText(label_signout_locator).equals(label_signout);
			}

		public void clickOnSignOut() throws Exception {
			this.click(label_signout_locator);
		}

}
