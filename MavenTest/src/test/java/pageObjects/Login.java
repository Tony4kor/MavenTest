package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base_setup.BaseClass;


public class Login{
	
   private WebDriver driver;
    By emailLocator = By.cssSelector("#Email");
    By passwordLocator = By.cssSelector("#Password");
    
    public Login(WebDriver driver) {
    	this.driver= driver;
    }

    public void clickLogInBtn(){
        driver.findElement(By.cssSelector("input[class=\'button-1 login-button\']")).click();
    }

    public void with(String email, String password){
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(passwordLocator).submit();
    }

    public void verifyPage(){
        Assert.assertTrue(driver.getTitle().equals("Demo Web Shop. Login"));
    }

    public void verifyUser(){
        String userVisible  = driver.findElement(By.cssSelector("a[class=\'account\']")).getText();
        boolean resoult = userVisible.endsWith("@gmail.com");
        Assert.assertTrue(resoult);
    }

    public void verifyWrongLogPass(){
        boolean expected = driver.findElement(By.cssSelector("div[class=\'validation-summary-errors\']")).isDisplayed();
        Assert.assertTrue(expected);

    }
    public void clickLogInLink(){
        driver.findElement(By.cssSelector(".ico-login")).click();
    }

    public void searchForItem(String searchItem){
        driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).sendKeys(searchItem);
        driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).submit();

    }

}
