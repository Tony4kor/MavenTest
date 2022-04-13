package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserTest {
	
	
	WebDriver driver;
//	@BeforeTest
	public void fireFox() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://courses.letskodeit.com/practice");
		Thread.sleep(5000);
		driver.close();
	}
//	@Test
	public void chromeTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		Thread.sleep(5000);
		driver.close();
		
	}
//	@AfterTest
	public void iEXtest() throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\webdrivers\\msedgedriver.exe");
		 driver = new EdgeDriver();
		driver.get("https://google.com");
		Thread.sleep(5000);
		driver.close();
		
	}

}
