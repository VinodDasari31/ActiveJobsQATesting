package ActiveJobsHomePageTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WTwoCheckBoxPage {
	
	WebDriver driver;
	
	
	// Constructor
	
	WTwoCheckBoxPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	
	@FindBy (xpath = "//button[@data-target='#filtersModal']")
	WebElement filter;
	
		@FindBy (xpath="//input[@id='w2cCheckbox']")
		WebElement wtwochek;
		
		//private WebElement checkBox;
		
		
		public boolean isCheckboxEnabled() {
			return wtwochek.isEnabled();
		}
		 
		public boolean isCheckboxSelected() {
			return wtwochek.isSelected();
		}
		
		public void clickCheckbox() {
	        if (isCheckboxEnabled()) {
	        	wtwochek.click();
	        }
	    }
		
		// Action Method
		
		public void ActFilters() {
			filter.click();
		}
		
		public void WTwoCheckbox() {
			wtwochek.click();
		}

}
