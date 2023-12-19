package runner.browser_manager;

import org.openqa.selenium.edge.EdgeDriver;


	public class EdgeDriverManager extends DriverManager{

		@Override
		public void createDriver() {
			System.setProperty("webdriver.msedge.driver", ".\\src\\test\\resources\\drivers\\msedgedriver.exe");
			 driver = new EdgeDriver();
		}
	
	}

