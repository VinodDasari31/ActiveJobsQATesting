package ActiveJobsHomePageTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotCancelButtonPage 
{
WebDriver driver;
	
	// Constructor
	
	ForgotCancelButtonPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	
	 @FindBy(xpath= "//a[@id = 'benchlogin']")
	 WebElement Header;
	 
	 @FindBy(xpath= "//a[@id='benchlayoutlogin']")
	 WebElement Layout;
	 
	 @FindBy(xpath= "//a[normalize-space()='Forgot Password?']")
	 WebElement forgot;
	 
	 @FindBy(xpath= "//input[@id='EmailId']")
	 WebElement email;
	 
	 @FindBy(xpath= "//a[@id='BSUForgotPasswordCancel']")
	 WebElement cancel;
	 
	 // Action Methods
	 public void header() 
	 {
		 Header.click();
	 }
	 public void layout() 
	 {
		 Layout.click();
		 
	 }
	 public void ForgotLink() {
		 forgot.click();
	 }
	 public void TextBox(String data) {
		 email.sendKeys(data);
	 }
	 public void CancelBtn() {
		 cancel.click();
	 }
	

}
