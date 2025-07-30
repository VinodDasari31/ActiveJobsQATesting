package ActiveJobsHomePageTestCases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindButtonPage 
{
	WebDriver driver;
	
	// Constructor
	
	FindButtonPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locator
	
	@FindBy(xpath="//input[@id='SearchText']")
	WebElement search;
	
	@FindBy(xpath="//button[@id='homefindjob']")
	WebElement find;
	
	// Action Methods
	
	public void SearchBar(String data) {
		search.sendKeys(data);
	}
	
	public void FindButton() {
		find.click();
	}
	
}
