package ActiveJobsHomePageTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSimilarJobsButtonPage 
{
	WebDriver driver;
	
	// constructor
	ViewSimilarJobsButtonPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	// locators
	
	
	
	
	@FindBy(xpath="//a[@id='homeSimilarjob']")
	WebElement vsjButton;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement applyBtn;
	
	// Action Methods
	
	
	
	public void ViewSmlrJobs() {
		vsjButton.click();
	}
	
	
	public void ApplyBtn() {
		applyBtn.click();
	}

}
