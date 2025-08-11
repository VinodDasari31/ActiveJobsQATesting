package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogicPage extends ConstructorPage {
	
	public LogicPage(WebDriver driver){
		super(driver);
	}
	
	//@FindBy(xpath="//button[@id='benchsignupotp']")
	@FindBy (xpath="//div[@class='col-lg-5 col-md-6 d-none d-lg-block bg-light p-4 rounded-start']")
	WebElement account;
	
	public boolean IsLinkExists() {
		
		try {
			return (account.isDisplayed());
		}
		catch(Exception e) {
			return false;
		}
		
	}
	
	

}
