package BenchSalesRecruiterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BulkEmailsPage 
{
WebDriver driver;
	
	// Constructor
	
	BulkEmailsPage(WebDriver driver)
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
	 
	 @FindBy(xpath= "//a[@id='BSUHotlist']")
	 WebElement bulkEmail;
	 
	 @FindBy(xpath= "//a[@id='BSUEmailLists']")
	 WebElement addEmail;
	 
	 @FindBy(xpath="//input[@id='Subject']")
	 WebElement subject; 
	 
	 @FindBy(xpath="//div[@class='ql-editor ql-blank']")
	 WebElement body;
	 
	 @FindBy(xpath="//input[@id='Email']")
	 WebElement bEmail;
	 
	 @FindBy(xpath="//button[@id='BulkEmailTemplateSubmit']")
	 WebElement submit;
	 
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
		 public void BulkEmail() {
			 bulkEmail.click();
		 }
		 public void AddEmail() {
			 addEmail.click();
		 }
		 public void Subject(String data) {
			 subject.sendKeys(data);
			 
		 }
		 public void Body(String message) {
			 body.sendKeys(message);
		 }
		 public void BulkEmails(String mails) {
			 bEmail.sendKeys(mails);
		 }
		 public void Submit() {
			 submit.click();
		 }
}
