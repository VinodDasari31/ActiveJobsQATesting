package BenchSalesRecruiterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BulkDataPage 
{
	WebDriver driver;
	
	BulkDataPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
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
	 
	 @FindBy(xpath="//a[@id='benchmultipledata']")
	 WebElement bulkData;
	 
	 @FindBy(xpath="//input[@id='fileUploadInput']")
	 WebElement file;
	 
	 @FindBy(xpath="//input[@id='manualInput']")
	 WebElement manual;
	 
	/* @FindBy(xpath="//input[@id='rowNumber']")
	 WebElement enterNum;
	 
	 @FindBy(xpath="//button[@class='btn btn-primary mt-3']")
	 WebElement addRows;
	 
	 @FindBy(xpath="//button[@class='btn btn-danger']")
	 WebElement delete; */
	 
	 @FindBy(xpath="//input[@name='data[0].Name']")
	 WebElement name;
	 
	 @FindBy(xpath="//input[@name='data[0].EmailID']")
	 WebElement emailId;
	 
	 @FindBy(xpath="//input[@name='data[0].CompanyName']")
	 WebElement company;
	 
	 @FindBy(xpath="//button[normalize-space()='Submit']")
	 WebElement submit;
	 
	 
	 
	 
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
	 public void DataCollectionDropDown() {
		 dataCollection.click();
	 }
	 public void BulkData() {
		 bulkData.click();
	 }
	 public void FileUpload() {
		 file.click();
	 }
	 public void ManualEnter() {
		 manual.click();
	 }
	/* public void EnterNumber(String number) {
		 enterNum.sendKeys(number);
	 }
	 public void RowsButton() {
		 addRows.click();
	 }
	 public void Delete() {
		 delete.click();
	 } */
	 
	 public void AddData(String Name) {
		 name.sendKeys(Name);
	 }
	 public void Mail(String EmailId) {
		 emailId.sendKeys(EmailId);
	 }
	 public void Company(String cName) {
		 company.sendKeys(cName);
	 }
	 public void Submit() {
		 submit.click();
	 }
	 

}
