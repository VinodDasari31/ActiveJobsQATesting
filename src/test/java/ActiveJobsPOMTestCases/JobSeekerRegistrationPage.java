package ActiveJobsPOMTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JobSeekerRegistrationPage {
	
	WebDriver driver;
	 WebDriverWait wait;
	// Constructor
	 
	 @FindBy(xpath="//button[@id='Signupsubmit']")
		WebElement signUpBtn;
	
	JobSeekerRegistrationPage(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	 // Scroll to element and click
    public void scrollAndClickElement() {
        // Scroll element into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", signUpBtn);
        
        // Wait until the element is clickable and then click
        wait.until(ExpectedConditions.elementToBeClickable(signUpBtn)).click();
        
    }
	
	// Locators
	
	@FindBy(xpath="//a[@id='benchJob']")
	WebElement JsHeader;
	
	@FindBy(xpath="//a[@id='jobseekerregistration']")
	WebElement JsLayout;
	
	@FindBy (xpath="//input[@id='User_Name']")
	WebElement JsName;
	
	@FindBy (xpath="//input[@name='Email_Id']")
	WebElement JsEmail;
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement JsPassword;
	
	@FindBy(xpath="//input[@name='RePassword']")
	WebElement CPassword;
	
	//@FindBy(xpath="//input[@placeholder='dd/mm/yyyy']")
	//WebElement Dob;
	
	//@FindBy(xpath="//button[@id='Signupsubmit']")
	//WebElement signUpBtn;
	
	
	// Action Methods
	
	public void JsrHeader() {
		JsHeader.click();
	}
	
	public void JsrLayout() {
		JsLayout.click();
	}
	
	public void UserName(String userName) {
		JsName.sendKeys(userName);
	}
	public void Email(String email) {
		JsEmail.sendKeys(email);
	}
	public void Password(String password) {
		JsPassword.sendKeys(password);
	}
	public void CnfPassword(String cPassword) {
		CPassword.sendKeys(cPassword);
	}
	/*public void DateOfBirth(String dob) {
		Dob.sendKeys(dob); 
	}  */
	public void SignUpBtn() {
		signUpBtn.click();
	} 
	
	

}
