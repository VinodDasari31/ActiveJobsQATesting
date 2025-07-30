package ActiveJobsHomePageTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSimilarJobViewButtonPage 
{
  WebDriver driver;
  
  // constructor
  ViewSimilarJobViewButtonPage(WebDriver driver){
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
   // Locators
  
  @FindBy(xpath="//a[@id='homeSimilarjob']")
	WebElement vsButton;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement viewJob;
	
	// Action Methods
	
	public void ViewJobBtn() {
		vsButton.click();
	}
	
	public void ViewJobs() {
		viewJob.click();
	}
  
}
