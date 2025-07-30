package BenchSalesRecruiterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsultantDeletePage 
{
	WebDriver driver;
	
	// Constructor
	
	ConsultantDeletePage(WebDriver driver)
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
	 
	 @FindBy(xpath= "//a[@id='BSUJobResumes']")
	 WebElement consultant;
	 
	 @FindBy(xpath= "//*[@class='fa fa-trash']")
	 WebElement delete;
	 
	 @FindBy(xpath="//*[@class='btn btn-danger']")
	 WebElement confirmDelete;
	 
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
		 
		 public void Consultant() {
			 consultant.click();
		 }
		 public void Delete() {
			 delete.click();
		 }
		 public void ConfirmDelete() {
			 confirmDelete.click();
		 }

}
