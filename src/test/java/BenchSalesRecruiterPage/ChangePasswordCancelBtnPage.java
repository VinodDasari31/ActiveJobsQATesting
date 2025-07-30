package BenchSalesRecruiterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordCancelBtnPage {
	
WebDriver driver;
	
	// Constructor
	
ChangePasswordCancelBtnPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	
	 @FindBy(xpath= "//a[@id = 'benchlogin']")
	 WebElement Header;
	 
	 @FindBy(xpath= "//a[@id='benchlayoutlogin']")
	 WebElement Layout;
	 
	 @FindBy(xpath= "//input[@name='RecruiterEmailId']")
	 WebElement email;
	 
	 @FindBy(xpath= "//input[@name='Password']")
	 WebElement password;
	 
	 @FindBy(xpath= "//button[@id='BenchLogins']")
	 WebElement login;
	 
	 @FindBy(xpath="//a[@id='ChangePasswords']")
	 WebElement changePsw;
	 
	 @FindBy(xpath="//input[@id='OldPassword']")
	 WebElement oldPsw;
	 
	 @FindBy(xpath="//input[@id='NewPassword']")
	 WebElement newPsw;
	 
	 @FindBy(xpath="//input[@id='ConfirmPassword']")
	 WebElement cnfPsw;
	 
	 @FindBy(xpath="//a[@itemid='Benchcancekchangepassword']")
	 WebElement cancelButton;
	 
	 
	// Action Methods
		 public void header() 
		 {
			 Header.click();
		 }
		 public void layout() 
		 {
			 Layout.click();
			 
		 }
		 public void Email(String user) {
			 email.sendKeys(user);
		 }
		 public void Password(String psw) {
			 password.sendKeys(psw);
		 }
		 public void LoginBtn() {
			 login.click();
		 }
		 public void ChangePswDropDown() {
			 changePsw.click();
		 }
		 public void OldPassword(String oldPass) {
			 oldPsw.sendKeys(oldPass);
		 }
		 public void NewPassword(String newPass) {
			 newPsw.sendKeys(newPass);
		 }
		 public void ConfirmPassword(String cnfPass) {
			 cnfPsw.sendKeys(cnfPass);
		 }
		 public void CancelButton() {
			 cancelButton.click();
		 }
	

}




