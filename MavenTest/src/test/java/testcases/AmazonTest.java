package testcases;

import org.testng.annotations.Test;

import base_setup.BaseClass;


public class AmazonTest extends BaseClass{
	
    
	@Test
	public	void Amazon() {
		Amazon amazon = new Amazon(driver);
		driver.get ("https://www.amazon.com/");
		amazon.searchBox("sunglass");
		amazon.searchBtn.click();
		amazon.product.click();
		amazon.addToCart.click();
		amazon.checkOutBtn.click();
		amazon.createAmzAccBtn.click();
		amazon.nameBox("Iron Man");
		amazon.emailBox("iron@gmail.com");
		amazon.pswdBox("iron-man");
		amazon.reEnPswdBox("iron-man");
		amazon.createAccBtn.click();

	}

}
