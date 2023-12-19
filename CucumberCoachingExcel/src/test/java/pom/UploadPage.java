package pom;



import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class UploadPage extends BasePage{

	private String uploadPageTitle = "File input - Multi select";
	private By buSearch = By.xpath("//*[@tabindex=\"500\" and @class=\"btn btn-primary btn-file\"]");
	private By imageUploaded = By.xpath("//*[@class='kv-preview-data file-preview-image' and @title='Selenium.jpg']");
	private By btnRemove = By.xpath("//*[text() = \"Remove\"]");
	private By imageRemoved = By.xpath("//*[@class='file-input file-input-new']");
	private By imageUploadedTrue = By.xpath("//*[@class='file-input']");
	
	
	public boolean uploadPageIsDisplayed() throws Exception {
		return this.getTitle().equals(uploadPageTitle);
		}
	
	
	
	public UploadPage(WebDriver driver) {
		super(driver);
	}		
			
	
	public void clickBuSearch() throws Exception {
	this.click(buSearch);
	}
	
	public void uploadImage() throws AWTException, InterruptedException {
	this.uploadPicture("C:\\Users\\j.garza.montemayor\\OneDrive - Accenture\\Documents\\Automation\\Selenium Proyecto Final\\Selenium.jpg");		    
	}
		    
	public void uploadedImageIsDisplayed() throws Exception {
		this.isDisplayed(imageUploaded);
	}
	
	public void uploadedImageTrueIsDisplayed() throws Exception {
		this.isDisplayed(imageUploadedTrue);
	}

	public void clickRemoveButton() throws Exception {
		this.click(btnRemove);
	}

	public void noImageDisplayed() throws Exception {
		this.isDisplayed(imageRemoved);
	}
	
}
