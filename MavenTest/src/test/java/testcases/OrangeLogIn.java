package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_setup.BaseClass;

public class OrangeLogIn extends BaseClass{
	
	
	private @FindBy(css = "[name='txtUsername']") WebElement inputUserName;
	private @FindBy(css = "[name='txtPassword']") WebElement inputPassword;
	 @FindBy(css = "[name='Submit']") WebElement logInBtn;

	 
	 public OrangeLogIn(WebDriver driver) {
		 this.driver = driver; PageFactory.initElements(driver, this);;
	 }
		
	public void insertUserName(String username) {
		inputUserName.sendKeys(username);
	}
	
	public void insertPassword(String pass) {
		inputPassword.sendKeys(pass);
	}
}
