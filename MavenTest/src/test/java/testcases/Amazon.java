package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_setup.BaseClass;

public class Amazon extends BaseClass{
	

	@FindBy(id = "twotabsearchtextbox") WebElement searchBox;
	@FindBy(css = "div[class='nav-search-submit nav-sprite']") WebElement searchBtn;
	@FindBy(css = "a[class='a-link-normal a-text-normal']") WebElement product;
	@FindBy(name = "submit.add-to-cart") WebElement addToCart;
	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")WebElement  checkOutBtn;
	@FindBy(id = "createAccountSubmit") WebElement createAmzAccBtn;
	@FindBy(name = "customerName") WebElement nameBox;
	@FindBy(name = "email") WebElement emailBox;
	@FindBy(name = "password") WebElement pswdBox;
	@FindBy(name = "passwordCheck" ) WebElement reEnPswdBox;
	@FindBy(id = "continue") WebElement createAccBtn;
	@FindBy(id = "continue") WebElement contSingInBtn;
	@FindBy(id = "ap_email") WebElement singInBox;
	@FindBy(name = "password") WebElement singInPswBox;
	@FindBy(id = "signInSubmit") WebElement singInBtn;
 
	public Amazon(WebDriver driver) {
		this.driver = driver; PageFactory.initElements(driver, this);
	}

	public void searchBox(String searchItem) {
		searchBox.sendKeys(searchItem);
	}
	public void nameBox(String insertName) {
		nameBox.sendKeys(insertName);
	}
	public void emailBox(String insertEmail) {
		emailBox.sendKeys(insertEmail);
	}
	public void pswdBox(String insertPswd) {
		pswdBox.sendKeys(insertPswd);
	}
	public void reEnPswdBox(String reEntPswd) {
		reEnPswdBox.sendKeys(reEntPswd);
	}
	public void singInBox(String insertSingInEmail) {
		singInBox.sendKeys(insertSingInEmail);
	}
	public void singInPswBox(String insetrSingInPswd ) {
		singInPswBox.sendKeys(insetrSingInPswd);
	}
}
