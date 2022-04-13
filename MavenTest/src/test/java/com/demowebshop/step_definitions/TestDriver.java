package com.demowebshop.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base_setup.BaseClass;

public class TestDriver extends BaseClass{
	@Test
	public void launch() {
		driver.get("http://google.com/");
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Iphone");
		
	}
	@Test
	public void clickRegisterLink() {
		
	}

}
