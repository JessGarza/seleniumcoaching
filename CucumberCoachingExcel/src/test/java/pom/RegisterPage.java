package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.netty.util.internal.ThreadLocalRandom;

public class RegisterPage extends BasePage{

	private String registerPageTitle = "Register";
	
	private By labelRegister = By.linkText("Register");
	private By txtboxFirstname = By.cssSelector("input[placeholder = 'First Name']");
	private By txtboxLastname = By.cssSelector("input[placeholder='Last Name']");
	private By txtboxAdddress = By.cssSelector("textarea[ng-model='Adress']");
	private By txtboxEmailaddress = By.cssSelector("input[ng-model='EmailAdress']");
	private By rbtnMale = By.cssSelector("input[value='Male']");
	private By rbtnFemale = By.cssSelector("input[value='FeMale']");
	private By radiobuttons = By.xpath("//*[@type = \"checkbox\"]"); //List***********************
	private By dropLanguages = By.id("msdd");
	private By dutch = By.xpath("//a[contains(text(), 'Dutch')]");
	private By estonian = By.xpath("//a[contains(text(), 'Estonian')]");
	private By english= By.xpath("//a[contains(text(), 'English')]");
	private By labelSkills = By.xpath("//*[text()=\"Skills\"]");
	private By closeIcons = By.cssSelector(".ui-icon.ui-icon-close"); //List**********************
	private By dropSkills = By.id("Skills"); //Select
	private By dropSelectcountry = By.xpath("//*[@aria-labelledby=\"select2-country-container\"]");
	private By dropCountry = By.xpath("//*[@class=\"select2-search__field\"]");
	private By dropCountry2 = By.id("country"); //Select
	private By dropYears = By.id("yearbox"); //Select
	private By labelBirth = By.xpath("//*[text()=\"Date Of Birth\"]");
	private By dropMonths = By.xpath("//*[@placeholder =\"Month\"]"); //Select
	private By dropDays = By.id("daybox");   //Select
	private By txtboxPass = By.id("firstpassword");
	private By txtboxConfirmpass = By.id("secondpassword");
	private By btnSubmit = By.id("submitbtn");
	private By txtboxPhone = By.cssSelector("input[ng-model='Phone']");
	private By dropCountries = By.xpath("//*[@id='countries']");
	
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		}	
	
	
	public boolean registerPageIsDisplayed() throws Exception {
		return this.getTitle().equals(registerPageTitle);
		}
	
	
	public void typeFirstName() throws Exception {
		this.sendKeys(txtboxFirstname, "Pedro");
		}
	
	public void typeLastName() throws Exception {
		this.sendKeys(txtboxLastname, "Pascal");
		}
	
	public void typeAddress() throws Exception {
		this.sendKeys(txtboxAdddress, "New York\n 5th avenue\n apartament 80");
		}
	
	public void typeInvalidEmailAddress() throws Exception {
		this.sendKeys(txtboxEmailaddress, "pedropgmail.com");
		}
	
	public void clickRadioButtonMale() throws Exception {
		this.click(rbtnMale);
		}
	
	public void clickRadioButtonFemale() throws Exception {
		this.click(rbtnFemale);
		}
	
	public void clickDropSelectCountry() throws Exception {
		this.click(dropSelectcountry);
		}
	
	public void clickDropCountry() throws Exception {
		this.click(dropCountry);
		}
	
	public void clickLabelBirth() throws Exception {
		this.click(labelBirth);
		}
	
	public void typePassword() throws Exception {
		this.sendKeys(txtboxPass, "Joel");
		}
	
	public void typeConfirmPassword() throws Exception {
		this.sendKeys(txtboxConfirmpass, "Joel");
		}
	
	public void clickSubmitButton() throws Exception {
		this.click(btnSubmit);
		}
	
	public void clearEmailAddressTextField() throws Exception {
		this.clear(txtboxEmailaddress);
	}
	
	public void typeValidEmailAddress() throws Exception {
		this.sendKeys(txtboxEmailaddress, "pedrop@gmail.com");
		}
	
	public void typePhoneNumber() throws Exception {
		this.sendKeys(txtboxPhone, "5556547895");
		}
	
	public void typeInvalidPhoneNumber() throws Exception {
		this.sendKeys(txtboxPhone, "\"abcdefghuj\"");
		}
	
	public String dropCountriesGetAttribute() throws Exception {
		return this.getAttribute(dropCountries, "validationMessage");
		}
			
	public void selectRandomHobbies() throws Exception {
		this.getRadioButtonsSize(radiobuttons);
		}
		
	public void clickDropLanguages() throws Exception {
		this.click(dropLanguages);
		}
	
	public void clickDutchLanguage() throws Exception {
		this.click(dutch);
	}
	
	public void clickEstonianLanguage() throws Exception {
		this.click(estonian);
	}
	
	public void clickEnglishLanguage() throws Exception {
		this.click(english);
	}
	
	public void closeEstonianLanguage() {
		this.closeLanguageIcons(dropLanguages);
	}
	
	public void clickLabelSkills() throws Exception {
		this.click(labelSkills);
	}
	public void clickSkills() throws Exception {
		this.click(dropSkills);
	}
	
	public void selectSkill() {
		this.selectSkill(dropSkills, "iOS");
	}
	
	public void selectCountry() throws Exception {
		this.click(dropSelectcountry);
		this.sendKeys(dropCountry, "u");
		this.selectCountry(dropCountry2, "South Africa");
		this.click(labelBirth);
	}
	
	public void selectDateOfBirth() throws Exception {
		this.selectYearOfBirth(dropYears, "1975");
		this.click(labelBirth);
		this.selectMonthOfBirth(dropMonths, "April");
		this.click(labelBirth);
		this.selectDayOfBirth(dropDays, "2");
		this.click(labelBirth);
	}
	
	public void scrollDown() throws InterruptedException {
		this.scrollDown(5000);	
	}
	
	public String txtboxEmailaddressGetAttribute() throws Exception {
		return this.getAttribute(txtboxEmailaddress, "validationMessage");
	}
	
	public void clearAddressTextField() throws Exception {
		this.clear(txtboxAdddress);
	}
	
	public void clearLastNameTextField() throws Exception {
		this.clear(txtboxLastname);
	}	
	
	public String txtboxLastNameGetAttribute() throws Exception {
		return this.getAttribute(txtboxLastname, "validationMessage");
	}
	
	public void clearPhoneNumberField() throws Exception {
		this.clear(txtboxPhone);
	}	
	
	public String txtboxPhoneNumberGetAttribute() throws Exception {
		return this.getAttribute(txtboxPhone, "validationMessage");
	}
	

}
	
	

	
