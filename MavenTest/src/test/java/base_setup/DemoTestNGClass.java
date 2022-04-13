package base_setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DemoTestNGClass {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest extentTest;
	
	WebDriver driver;
	
	
	@BeforeClass
	public void beforeClass() {
		htmlReporter = new ExtentHtmlReporter("./reports/extent.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Reports");
		htmlReporter.config().setReportName("Automation Test Results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.setSystemInfo("Project", "DemoWebShop");
		extent.setSystemInfo("Browser", "Chrome");
		extent.attachReporter(htmlReporter);
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
		extent.flush();
	}

	@Test
	public void testSuccessful() {
		driver.get("http://demowebshop.tricentis.com/");
		extentTest = extent.createTest("Successful Test");
		extentTest.log(Status.PASS, "Test Method Successful");	
	}
	@Test
	public void testFaild() {
		extentTest = extent.createTest("Failed Test");
		extentTest.log(Status.FAIL, "Test Method Failed");	
		Assert.fail();
	}
	@Test
	public void testSkipped() {
		extentTest = extent.createTest("Skipped Test");
		extentTest.log(Status.SKIP, "Test Method Skipped");	
		throw new SkipException("Executing Skipped Test Method");
	}

	@AfterMethod
	public void afterMethod() {
	}

	

	

}
