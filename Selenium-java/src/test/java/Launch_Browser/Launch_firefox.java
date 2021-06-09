package Launch_Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_firefox {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\mukesh\\eclipse-workspace\\Selenium-java\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

			

		}

	}

