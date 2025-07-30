package ActiveJobsHomePageTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FiltersPage {
	
	WebDriver driver;
	
	// Constructor
	
	FiltersPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Locators
	
	@FindBy (xpath = "//button[@data-target='#filtersModal']")
	WebElement filter;
	
	@FindBy (xpath="//input[@id='c2cCheckbox']")
	WebElement c2c;
	
	@FindBy (xpath = "//input[@id='fullTimeCheckbox']")
	WebElement fullTime;
	
	@FindBy(xpath="//input[@id='Hybrid']")
	WebElement hybrid;
	
	@FindBy(xpath="//input[@id='Remote']")
	WebElement remote;
	
	@FindBy(xpath="//input[@id='OnSite']")
	WebElement onsite;
	
	// Method to check if checkbox is Enabled
	
		public  boolean isCheckboxEnabled() {
			return c2c.isEnabled();
		}
		public boolean fullTimeCheckboxEnabled() {
			return fullTime.isEnabled();
		}
		public boolean hybridChkBxEnabled() {
			return hybrid.isEnabled();
			
		}
		public boolean remoteChkBxEnabled() {
			return remote.isEnabled();
		}
		public boolean onSitechkbxEnabled() {
			return onsite.isEnabled();
		}
		
	// Method to check fi checkbox is Selected
		
		public boolean isCheckboxSelected() 
		{
			return c2c.isSelected();
		}
		public boolean fullTimeCheckboxSelected() {
			return fullTime.isSelected();
		}
		public boolean hybridChkBxSelected() {
			return hybrid.isSelected();
			
		}
		public boolean remoteChkBxSelected() {
			return remote.isSelected();
		}
		public boolean onSitechkbxSelected() {
			return onsite.isSelected();
		}
		
	// Method to click the checkbox (if enabled)	
		public void clickCheckbox() {
			if(isCheckboxEnabled()) {
				c2c.click();
			}
		}
		
		public void FullTime() {
			if(fullTimeCheckboxEnabled()) {
				fullTime.click();
			}
		}
		
		public void Hybrid() {
			if(hybridChkBxEnabled()) {
				hybrid.click();
			}
		}
		
		public void Remote() {
			if(remoteChkBxEnabled()) {
				remote.click();
			}
		}
		
		public void OnSite() {
			if(onSitechkbxEnabled()) {
				onsite.click();
			}
		}
	
	// Action Methods
	
	public void ActFilters() {
		filter.click();
	}
	public void CtwoC() {
		c2c.click();
	}
	/*public void FullTime() {
		fullTime.click();
	}
	public void Hybrid() {
		hybrid.click();
	}
	public void Remote() {
		remote.click();
	}
	public void OnSite() {
		onsite.click();
	} */
	

}
