package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.MyAccountPage;
import pom.HelloPage;
import pom.MainPage;
import pom.ShopPage;
import pom.OrdersPage;
import pom.RegisterPage;
import pom.UploadPage;

public class TestBase {

	protected WebDriver driver = Hooks.getDriver();
	protected MyAccountPage myaccountpage = new MyAccountPage(driver);
	protected HelloPage hellopage = new HelloPage(driver);
	protected MainPage mainpage = new MainPage(driver);
	protected ShopPage shoppage = new ShopPage(driver);
	protected OrdersPage orderspage = new OrdersPage(driver);
	protected RegisterPage registerpage = new RegisterPage(driver);
	protected UploadPage uploadpage = new UploadPage(driver);
		
	
}
