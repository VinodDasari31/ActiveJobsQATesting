package BenchSalesRecruiterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportBugPage 
{
	WebDriver driver;
	
	// Constructor
	
	ReportBugPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
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
		 
		 @FindBy(xpath="//*[@id='Benchreport']")
		 WebElement reportBug;
		 
		 @FindBy(xpath="//select[@id='Screen_Type_Id']")
		 WebElement selectScreen;
		 
		 @FindBy(xpath="//input[@id='Email']")
		 WebElement reportEmail;
		 
		 @FindBy(xpath="//input[@id='Action']")
		 WebElement action;
		 
		 @FindBy(xpath="//input[@id='Issue']")
		 WebElement issue;
		 
		 @FindBy(xpath="//button[@id='submitIssue']")
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
				 public void ReportBug() {
					 reportBug.click();
				 }
				 public void SelectScreen(String screen) {
					 selectScreen.sendKeys(screen);
				 }
				 public void ReportEmail(String mail) {
					 reportEmail.sendKeys(mail);
				 }
				 public void Action(String actions) {
					 action.sendKeys(actions);
				 }
				 public void Issue(String issues) {
					 issue.sendKeys(issues);
				 }
				 public void Submit() {
					 submit.click();
				 }
	
}
