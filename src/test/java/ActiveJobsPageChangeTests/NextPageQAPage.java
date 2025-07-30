package ActiveJobsPageChangeTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextPageQAPage {
	
	WebDriver driver;
	
	// constructor
	
	NextPageQAPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	
	@FindBy(xpath="//iframe[@id='google_esf']")
	WebElement down;
	
	@FindBy(xpath="//a[@class='page-link']")
	WebElement nextPage;
	
	
	/*@FindBy(xpath="")
	WebElement  */
	
	public void DownPage() {
		down.click();
	}
	
	public void NextPage() {
		nextPage.click();
	}
}
