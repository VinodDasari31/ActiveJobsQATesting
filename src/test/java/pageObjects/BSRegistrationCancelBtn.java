package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BSRegistrationCancelBtn extends ConstructorPage {
	
	WebDriver driver;
	
	public BSRegistrationCancelBtn(WebDriver driver){
		super(driver);
	}
	
	// Locators
	
		 @FindBy(xpath= "//a[@id = 'benchlogin']")
		 WebElement Header;
		 
		 @FindBy(xpath= "//a[@id='benchregister']")
		 WebElement BsRegistration;
		
		@FindBy (xpath= "//input[@name='RecruiterName']")
		WebElement RecName;
		
		@FindBy (xpath="//input[@id='RecruiterEmailId']")
		WebElement email;
		
		@FindBy (xpath="//input[@placeholder='Enter Password']")
		WebElement psw;
		
		@FindBy (xpath="//input[@name='RePassword']")
		WebElement cnfPassword;
		
		@FindBy (xpath="//input[@name='Company']")
		WebElement company;
		
		@FindBy (xpath="//*[@name='CallingCode']")
		WebElement codes;
		
		@FindBy (xpath="//input[@name='ContactNo']")
		WebElement contactNo;
		
		@FindBy (xpath="//input[@name='Location']")
		WebElement location;
		
		@FindBy (xpath="//input[@name='Country']")
		WebElement country;
		
		//@FindBy (xpath="//span[@id='recaptcha-anchor']")
		//WebElement captcha;
		
		@FindBy (xpath="//a[@id='BSUSignupCancel']")
		WebElement cancel;
		
		
		
		// Action Methods
		
		public void BsHeader() {
			Header.click();
		}
		
		public void Registration() {
			BsRegistration.click();
		}
		
		public void RecruiterName(String hrName) 
		{
			RecName.sendKeys(hrName);
		}
		
		public void recEmail(String mail) {
			email.sendKeys(mail);
		}
		
		public void recPassword(String password) 
		{
			psw.sendKeys(password);
		}
		
		public void recCnfPassword(String conPassword) {
			cnfPassword.sendKeys(conPassword);
		}
		
		public void recCompany(String companyName) {
			company.sendKeys(companyName);
		}
		public void recCodes(String uniCodes) {
			codes.sendKeys(uniCodes);
		}
		
		public void recContactNo(String mobile) {
			contactNo.sendKeys(mobile);
		}
		
		public void recLocation(String cLocation) {
			location.sendKeys(cLocation);
		}
		
		public void recCountry(String cCountry) {
			country.sendKeys(cCountry);
		}
		
		/*public void recCaptcha() {
			captcha.click();
		} */
		
		public void recCancel() {
			cancel.click();
		}

}
