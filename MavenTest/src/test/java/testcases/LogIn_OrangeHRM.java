package testcases;

import org.testng.annotations.Test;

import base_setup.BaseClass;


public class LogIn_OrangeHRM extends BaseClass{
	


	OrangeLogIn homePage;
	
	@Test
	public void logInToApplication() {
		homePage = new OrangeLogIn(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		homePage.insertUserName("Admin");
		homePage.insertPassword("admin123");
		homePage.logInBtn.click();
	}
	
	@Test
	public void logInWithWrong() {
		homePage = new OrangeLogIn(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		homePage.insertUserName("Admin1");
		homePage.insertPassword("admin1234");
		homePage.logInBtn.click();
	}

}
