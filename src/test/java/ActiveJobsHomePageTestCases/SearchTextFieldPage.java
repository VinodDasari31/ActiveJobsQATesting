package ActiveJobsHomePageTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchTextFieldPage {
	
	WebDriver driver;
	
	// Constructor
	SearchTextFieldPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	
	@FindBy(xpath="//input[@id='SearchText']")
	WebElement search;
	
	//@FindBy(xpath="")
	//WebElement text;
	
	@FindBy(xpath="//button[@id='homefindjob']")
	WebElement findButton;
	
	
	// Action Methods
	
	public void SearchBox(String text) {
		search.sendKeys(text);
	}
	/*public void Text(String texts) {
		text.sendKeys();
	} */
	public void FindBtn() {
		findButton.click();
	}
	

}
