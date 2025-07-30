package BenchSalesRecruiterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataCollectionPage {
	
WebDriver driver;
	
	// Constructor
	
DataCollectionPage(WebDriver driver)
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
	 
	 @FindBy(xpath="//a[@id='datacollection']")
	 WebElement dataCollection;
	 
	 @FindBy(xpath="//a[@id='benchsingledata']")
	 WebElement singleData;
	 
	 @FindBy(xpath="//input[@id='EmailID']")
	 WebElement recordMail;
	 
	 @FindBy(xpath="//input[@id='Name']")
	 WebElement name;
	 
	 @FindBy(xpath="//input[@id='CompanyName']")
	 WebElement companyName;
	 
	 @FindBy(xpath="//button[@id='benchSingleRecord']")
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
			 public void DataCollection() {
				 dataCollection.click();
			 }
			 public void SingleRecord() {
				 singleData.click();
			 }
			 public void SingleEmail(String mail) {
				 recordMail.sendKeys(mail);
			 }
			 public void Name(String recordName) {
				 name.sendKeys(recordName);
			 }
			 public void CompanyName(String cmpName) {
				 companyName.sendKeys(cmpName);
			 }
			 public void Submit() {
				 submit.click();
			 }

}
