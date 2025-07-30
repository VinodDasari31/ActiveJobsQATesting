package ActiveJobsHomePageTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyNowButtonPage 
{
	WebDriver driver;
	
	ApplyNowButtonPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='homeApplyNow']")
	WebElement applyNow;
	
	public void ApplyNowButton() {
		applyNow.click();
	}
}
