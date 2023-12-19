package seleniumgluecode;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {
	
	private static WebDriver driver;
	private static int numberOfCase = 0;
	private DriverManager driverManager;
	
	@Before
	public void setUp() throws InterruptedException {
		 numberOfCase ++;
		 System.out.println("*****Scenario Number:" + numberOfCase + " is executing*****");
		 driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		 driver = driverManager.getDriver();
		 //driver.get("http://practice.automationtesting.in/");
		 driver.manage().window().maximize();
	}
	
	@Given("^The user is in MyAccount page$")
	public void the_user_is_on_My_Account_page() {
		driver.get("https://practice.automationtesting.in/my-account/");
	}
	
	@Given("^The user is in Shop page$")
	public void the_user_is_on_Shop_page() {
		driver.get("https://practice.automationtesting.in/shop/");
	}
	
	@Given("^The user is in Register page$")
	public void the_user_is_in_register_page() {
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	
	@Given("^The user is in Upload page$")
	public void the_user_is_in_Upload_page() {
		driver.get("https://demo.automationtesting.in/FileUpload.html");
	}
	
	
	@After
	public void tearDown() {
		System.out.println("*****Scenario Number:" + numberOfCase + " was executed correctly*****");
		driverManager.quitDriver();
	}
		
	public static WebDriver getDriver() {
		return driver;
	}

}
