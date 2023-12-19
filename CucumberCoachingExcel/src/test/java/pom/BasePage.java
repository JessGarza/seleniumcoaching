package pom;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import io.netty.util.internal.ThreadLocalRandom;

public class BasePage {
	
	private WebDriver driver;
	JavascriptExecutor jse;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectFrame(int numFrame) throws InterruptedException{
		Thread.sleep(3000);
		driver.switchTo().frame(numFrame);
	}
	
	public void returnDefaultContent() {
		driver.switchTo().defaultContent();
	}
	
	public void click(By element) throws Exception {
		
		try {
			driver.findElement(element).click();
		} catch (Exception e) {
			throw new Exception("The element was not clicked: " + element);
		}
	}
	
	public void clear(By element) throws Exception {
		
		try {
			driver.findElement(element).clear();
		} catch (Exception e) {
			throw new Exception("The element was not cleared " + element);
		}
	}
	
	public boolean isDisplayed(By element) throws Exception {
		try {
			return driver.findElement(element).isDisplayed();
		} catch (Exception e) {
			throw new Exception("Element was not found " + element);
		}
		
	}
	
	public String getText(By element) throws Exception {
		try {
			return driver.findElement(element).getText();
		} catch (Exception e) {
			throw new Exception("The Element Text could not be obtained " + element);
		}
		
	}
	
	public String getTitle() throws Exception {
		try {
			return driver.getTitle();
		} catch (Exception e) {
			throw new Exception("The Element Title could not be obtained");
		}
	}
	
	public String getAttribute(By element, String message) throws Exception {
		try {
			return driver.findElement(element).getAttribute(message);
		} catch (Exception e) {
			throw new Exception("The Attribute could not be obtained " + element);
		}
	}
	
	
	public void sendKeys(By element, String text) throws Exception {
			try {
				driver.findElement(element).sendKeys(text);
			} catch (Exception e) {
				throw new Exception("The Element Text could not be sent " + element);
			}
		}
	
	public void scrollDown(int num) throws InterruptedException {
		jse = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		jse.executeScript("scroll(0," + String.valueOf(num)+ ")");
		Thread.sleep(1000);
	}
		
	public int getNumberOfElements(By element) {
		return driver.findElements(element).size();
	}
	
	public void getRadioButtonsSize(By element) throws Exception {
		try {
			int size = driver.findElements(element).size();
			int randnNumber = ThreadLocalRandom.current().nextInt(0, size);
			driver.findElements(element).get(randnNumber).click();
			int randnNumber2 = ThreadLocalRandom.current().nextInt(0, size);
			driver.findElements(element).get(randnNumber2).click();
			
		} catch (Exception e) {
			throw new Exception("The Size of the element couldn't be obtained" + element);
		}
	}
	
	public void closeLanguageIcons(By element) {
		List<WebElement> closeIcons = driver.findElement(element).findElements(By.cssSelector(".ui-icon.ui-icon-close"));
		for (WebElement icon : closeIcons) {
			WebElement parent = icon.findElement(By.xpath(".."));
			if(parent.getText().contains("Estonian")) {
				icon.click();
				break;
			}
		}
	}
	
	public void selectSkill(By element, String skill) {
		WebElement selectElement = driver.findElement(element);
		Select select = new Select(selectElement);
		select.selectByValue(skill);	
	}
	
	
	public void selectCountry(By element, String country) {
		WebElement selectElementCountry = driver.findElement(element);
		Select dropCountry2 = new Select (selectElementCountry);
		dropCountry2.selectByVisibleText(country);
	}
	
	
	public void selectYearOfBirth(By element,String year) {
		WebElement selectYearOfBirth = driver.findElement(element);
		Select dropYears = new Select (selectYearOfBirth);
		dropYears.selectByValue(year);
	}
	
	public void selectMonthOfBirth(By element, String month) {
		WebElement selectMonthOfBirth = driver.findElement(element);
		Select dropMonths = new Select (selectMonthOfBirth);
		dropMonths.selectByValue(month);
	}
	
	public void selectDayOfBirth(By element, String day) {
		WebElement selectDayOfBirth = driver.findElement(element);
		Select dropDays = new Select (selectDayOfBirth);
		dropDays.selectByValue(day);
	}

	public void uploadPicture(String route) throws AWTException, InterruptedException {
		Robot rb = new Robot();
		StringSelection str = new StringSelection("C:\\Users\\j.garza.montemayor\\OneDrive - Accenture\\Documents\\Automation\\Selenium Proyecto Final\\Selenium.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	    rb.setAutoDelay(1000);
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
	}
	
	
}
	
