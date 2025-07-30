package ActiveJobsLinkTests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BSRRegistrationLinksPage 
{
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	
	
	// Constructor
	
	BSRRegistrationLinksPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
	}
	
	
	
	
	
	// Locators
    
    @FindBy(xpath="//a[@id='benchsignuplink']")  // Change XPath to your actual element
    WebElement submitButton;
	
	 @FindBy(xpath= "//a[@id = 'benchlogin']")
	 WebElement Header;
	 
	 @FindBy(xpath= "//a[@id='benchregister']")
	 WebElement bsRegistration;
	 
	 
	 // Scroll to element
	    public void scrollToElement(WebElement element) {
	        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
	    }
	
	@FindBy(xpath="//a[@id='benchsignuplink']")
	WebElement clickHere;
	
	// Action Methods
	
	public void BsHeader() {
		Header.click();
	}
	
	public void Registration() {
		 scrollToElement(bsRegistration);
	        wait.until(ExpectedConditions.elementToBeClickable(bsRegistration)).click();
	        System.out.println("Clicked on View Button.");
		//BsRegistration.click();
	}
	
	public void ClickHereLink() {
		scrollToElement(clickHere);
        wait.until(ExpectedConditions.elementToBeClickable(clickHere)).click();
        System.out.println("Clicked on Apply Button.");
		//submitButton.click();
	}
}
