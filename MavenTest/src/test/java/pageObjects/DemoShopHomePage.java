package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.demowebshop.step_definitions.BaseClass2;



public class DemoShopHomePage{

		
	private WebDriver driver;
	
     String url= "http://demowebshop.tricentis.com/";
    
    @FindBy(css = ".header-menu [href=\'/computers\']") WebElement computersOnMenu;
    @FindBy(xpath = "//a[@href='/accessories']") WebElement accessories;
    @FindBy(css  = "#pollanswers-1") WebElement excellentRadioBtn;
    @FindBy(css = ".buttons #vote-poll-1") WebElement voteBtn;
    @FindBy(css = ".poll-vote-error") WebElement canVoteMessage;
    


    public DemoShopHomePage(WebDriver driver) {
    	 this.driver = driver; PageFactory.initElements(driver, this);
    }
    
	public void launch() {

		driver.get(url);
		
	}

    public void verifyDemoShopHomePage() {
      driver.findElement(By.cssSelector("div[class='topic-html-content-title']")).isDisplayed();

    }
    public void navigate_computers_menu_and_select_accessories() {
        Actions mouse = new Actions(driver);
        mouse.moveToElement(computersOnMenu).perform();
        accessories.click();
    }

    public void customer_clicks_on_excellent() {
        excellentRadioBtn.click();
    }

    public void excellent_is_selected() {
        Assert.assertTrue(excellentRadioBtn.isSelected());

    }
    public void customer_clicks_vote() {
       voteBtn.click();
    }

    public void verify_text_only_registered_users_can_vote() {
        boolean txt = canVoteMessage.isDisplayed();
        Assert.assertTrue(txt);
    }
	

    


}
