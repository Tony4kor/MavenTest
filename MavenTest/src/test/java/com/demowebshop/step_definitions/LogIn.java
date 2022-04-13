package com.demowebshop.step_definitions;


import io.cucumber.java.en.*;
import pageObjects.DemoShopHomePage;
import pageObjects.Login;



public class LogIn extends BaseClass2{
	
	
	@Given("User launches DemoShop home page")
	public void user_launches_demo_shop_home_page() {
		homePage = new DemoShopHomePage(driver);
		login = new Login(driver);
		homePage.launch();
	  
	}

	@When("User clicks on log in link")
	public void user_clicks_on_log_in_link() {
		login.clickLogInLink();
	    
	}

	@Then("User in Log in page")
	public void user_in_log_in_page() {
	   
	}

	@When("User enters {string} log in and pass {string} and clicks log in btn")
	public void user_enters_log_in_and_pass_and_clicks_log_in_btn(String string, String string2) {
	    
	}

	@Then("User should logged in")
	public void user_should_logged_in() {
	   
	}

	@Then("User shouldn't logged in")
	public void user_shouldn_t_logged_in() {
	    
	}
	
	
}
