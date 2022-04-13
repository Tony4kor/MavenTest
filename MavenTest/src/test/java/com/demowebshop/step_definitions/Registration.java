package com.demowebshop.step_definitions;


import io.cucumber.java.en.*;
import pageObjects.DemoShopHomePage;


public class Registration extends BaseClass2{

	
	
	@Given("User launches DemoShop")
	public void user_launches_demo_shop_home_page() {
		homePage=new DemoShopHomePage(driver);
		homePage.launch();
	  
	}

	@When("User clicks on register link")
	public void user_clicks_on_register_link() {
	
	   
	}

	@Then("User in registration page")
	public void user_in_registration_page() {
		
	}
}
