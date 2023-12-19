package seleniumgluecode;


import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.*;
import pom.ExcelUtil;

public class Test extends TestBase{
	
	private WebDriver driver = Hooks.getDriver();
	
	
	@Then("^The user verifies that is in MyAccount page")
	public void the_user_is_in_my_account_page() throws Exception {
	Assert.assertTrue(myaccountpage.myAccountPageIsDisplayed());
	
	}

	@When("^The user provide email and password and click submit$")
	public void the_user_provide_email_and_password_and_click_submit() throws Exception {
		Thread.sleep(3000);
		Assert.assertTrue(myaccountpage.typeEmailIsDisplayed());
		Object[][] data = ExcelUtil.readExcel("C:\\Users\\j.garza.montemayor\\eclipse-workspace\\CucumberCoachingExcel\\src\\test\\resources\\excelfiles\\ExcelFinalProject.xlsx", "test03");
		String validEmail = (String) data[0][0];
		String validPassword = (String) data[0][1];
		//myaccountpage.typeEmail("automation_test@gmail.com");
		myaccountpage.typeEmail(validEmail);
		//myaccountpage.typePassword("SbSmb3c1!");
		Thread.sleep(1000);
		myaccountpage.typePassword(validPassword);
		myaccountpage.clickOnLoginButton();
	}

	@Then("^The user is directed to next page$")
	public void the_user_is_directed_to_next_page() throws Exception {
				
		Assert.assertTrue("User was not logged in", hellopage.helloPageisDisplayed());
		
	
	}

	
	
	@When("^The user provide an invalid email and password and click on register$")
	public void the_user_provide_an_invalid_email_and_password_and_clik_on_register() throws Exception {
		Object[][] data = ExcelUtil.readExcel("C:\\Users\\j.garza.montemayor\\eclipse-workspace\\CucumberCoachingExcel\\src\\test\\resources\\excelfiles\\ExcelFinalProject.xlsx", "test04");
		String invalidEmail = (String) data[0][0];
		String invalidPassword = (String) data[0][1];
		//myaccountpage.typeRegEmail("automation_testgmail.com");
		myaccountpage.typeRegEmail(invalidEmail);
		//myaccountpage.typeRegPassword("SbSmb3c1!feererfh7453476gn");
		myaccountpage.typeRegPassword(invalidPassword);
		Thread.sleep(1000);
		myaccountpage.clickOnLabelPassword();
		myaccountpage.clickOnRegisterButton();
		
	}
	
	@Then("^Registration must fail with a warning message$")
	public void registration_musst_fail_with_a_warning_message() throws Exception {
		Assert.assertEquals("Message text control", "Incluye un signo \"@\" en la dirección de correo electrónico. La dirección \"automation_testgmail.com\" no incluye el signo \"@\".", myaccountpage.regEmailGetAttribute());
		
	}
	
	@Then("^The user verifies that is in Shop page$")
	public void the_user_verifies_that_is_in_shop_page() throws Exception {
		Assert.assertTrue(shoppage.shopPageIsDisplayed());
	}
	
		
	@When("^The user clicks on link$")
	public void the_user_clicks_on_link() throws Exception {
		shoppage.clickOnLinkAndroid();
	}
	
	@Then("^The user can see the products of that category$")
	public void the_user_can_see_the_products_of_that_category() throws Exception {
		Assert.assertTrue(shoppage.androidPageIsDisplayed());
		
	}
	
	@When("^The user clicks on orders link$")
	public void the_user_clicks_on_orders_link() throws Exception {
		orderspage.clickOnLinkOrders();
	}
	
	@Then("^The user can see their orders$")
	public void the_user_can_see_their_orders() throws Exception {
		Assert.assertTrue(orderspage.goShopIsDisplayed());
		}
	
	@Then("^The user click on Sign out$")
	public void the_user_click_on_sign_out() throws Exception {
		hellopage.clickOnSignOut();
	}
	
	@Then("^The user verifies that is in Register page")
	public void the_user_verifies_that_is_in_Register_page() throws Exception {
	Assert.assertTrue(registerpage.registerPageIsDisplayed());
	
	}
	
	@When("^The user provides name and lastname$")
	public void the_user_provides_name_and_lastname() throws Exception {
		registerpage.typeFirstName();
		registerpage.typeLastName();
	}
	
	@When("^The user provides an address in three lines$")
	public void the_user_provides_an_address_in_three_lines() throws Exception {
		registerpage.typeAddress();
	}
	
	@When("^The user provides an invalid email$")
	public void when_the_user_provides_an_invalid_email() throws Exception {
		registerpage.typeInvalidEmailAddress();
	}
	
	@When("^The user select a gendre$")
	public void the_user_select_a_gendre() throws Exception {
		registerpage.clickRadioButtonMale();
	}
	
	@When("^The user selects some hobbies randomly$")
	public void the_user_selects_some_hobbies_randomly() throws Exception {
		registerpage.selectRandomHobbies();
	}

	@When("^The user selects Dutch Estonian and English as language and then eliminates Estonian$")
	public void the_user_selects_Dutch_Estonian_and_English_as_language_and_then_eliminates_Estonian() throws Exception {
		registerpage.clickDropLanguages();
		registerpage.clickDutchLanguage();
		registerpage.clickEstonianLanguage();
		registerpage.clickEnglishLanguage();
		registerpage.closeEstonianLanguage();
		registerpage.clickLabelSkills();
	}

	@When("^The user selects iOS as skill$")
	public void the_user_selects_iOS_as_skills() {
		registerpage.selectSkill();
	}
	
	@When("^The user selects South Africa as a country$")
	public void the_ser_selects_South_Africa_as_a_country() throws Exception {
		registerpage.selectCountry();
	}

	@When("^The user selects their date of birth$")
	public void the_user_selects_their_date_of_birth() throws Exception {
		registerpage.selectDateOfBirth();
	}
	
	@When("^The user type a password and confirm the password$")
	public void the_user_type_a_password_and_confirm_the_password() throws Exception {
		registerpage.typePassword();
		registerpage.typeConfirmPassword();
	}
	
	@When("^The user clicks on submit button$")
	public void the_user_clicks_on_submit_button() throws Exception {
		Thread.sleep(1000);
		registerpage.scrollDown();
		registerpage.clickSubmitButton();
	}
	
	@When("^The user validates the email invalid error message$")
	public void the_user_Validates_the_email_invalid_error_message() throws Exception {
		Assert.assertEquals("Message text control", "Incluye un signo \"@\" en la dirección de correo electrónico. La dirección \"pedropgmail.com\" no incluye el signo \"@\".", registerpage.txtboxEmailaddressGetAttribute());
	}
	
	@When("^The user provides a valid email$")
	public void the_user_provides_a_valid_email() throws Exception {
		registerpage.clearEmailAddressTextField();
		registerpage.typeValidEmailAddress();
	}
	
	@When("The user eliminates lastname$")
	public void the_user_eliminates_lastname() throws Exception {
		registerpage.clearLastNameTextField();
	}
	
	@Then("^The user validates the lastname error message$")
	public void the_user_validates_the_lastname_error_message() throws Exception {
		Assert.assertEquals("Message text control", "Completa este campo", registerpage.txtboxLastNameGetAttribute());
	}
	
	@When("^The user provides the lastname and eliminates the address$")
	public void the_user_provides_the_lastname_and_eliminates_the_address() throws Exception {
		registerpage.typeLastName();
		registerpage.clearAddressTextField();
	}
	
	@When("^The user provides only letters on the phone field$")
	public void the_user_provides_only_letters_on_the_phone_field() throws Exception {
		registerpage.typeInvalidPhoneNumber();
	}
	
	@Then("^The user validates the phone number error message$")
	public void the_user_validates_the_phone_number_error_message() throws Exception {
		Assert.assertEquals("Message text control", "Haz coincidir el formato solicitado.", registerpage.txtboxPhoneNumberGetAttribute());
	}
	
	@When("^The user provides a valid phone number$")
	public void the_user_provides_a_valid_phone_number() throws Exception {
		registerpage.clearPhoneNumberField();
		registerpage.typePhoneNumber();
	}
	
	@Then("^The user validates the country error message$")
	public void the_user_validates_the_country_error_message() throws Exception {
		Assert.assertEquals("Message text control", "Selecciona un elemento de la lista", registerpage.dropCountriesGetAttribute());
	}
	
	@Then("^The user verifies that is in Upload page$")
	public void the_user_verifies_that_is_in_Upload_page() throws Exception {
		Assert.assertTrue(uploadpage.uploadPageIsDisplayed());
	}
	
	@When("^The user clicks on Browser button$")
	public void the_user_clicks_on_Browser_button() throws Exception {
		uploadpage.clickBuSearch();
	}
	
	@When("^The user select a picture and uploads it$")
	public void the_user_select_a_picture_and_uploads_it() throws AWTException, InterruptedException {
		uploadpage.uploadImage();
	}
	
	@Then("^The user validates that the picture is uploaded$")
	public void the_user_validates_that_the_picture_is_uploaded() throws Exception {
		uploadpage.uploadedImageIsDisplayed();
		uploadpage.uploadedImageTrueIsDisplayed();
	}
	
	@When("^The user clicks on Remove button$")
	public void the_user_clicks_on_remove_buttons() throws Exception {
		uploadpage.clickRemoveButton();
	}
	
	@Then("^The user validates that the pciture is removed$")
	public void the_user_validates_that_the_picture_is_removed() throws Exception {
		uploadpage.noImageDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
