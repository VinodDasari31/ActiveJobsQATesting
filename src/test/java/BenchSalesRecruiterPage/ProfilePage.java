package BenchSalesRecruiterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage 
{
	WebDriver driver;
	
	
	// Constructor
	ProfilePage(WebDriver driver)
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
	 
	 @FindBy(xpath= "//a[@id='BSUProfile']")
	 WebElement profile;
	 
	 @FindBy(xpath="//input[@id='userProfile_RecruiterName']")
	 WebElement recruiterName;
	 
	 @FindBy(xpath="//input[@id='userProfile_EncryptedEmailId']")
	 WebElement recEmail;
	 
	 @FindBy(xpath="//select[@id='CallingCodeDropdown']")
	 WebElement codes;
	 
	 @FindBy(xpath="//input[@id='userProfile_MobileNumber']")
	 WebElement contactNum;
	 
	 @FindBy(xpath="//input[@id='userProfile_WhatsappNumber']")
	 WebElement whattsApp;
	 
	 @FindBy(xpath="//input[@id='userProfile_CompanyName']")
	 WebElement companyName;
	 
	 @FindBy(xpath="//input[@id='userProfile_State_Type_Name']")
	 WebElement state;
	 
	 @FindBy(xpath="//input[@id='userProfile_Country']")
	 WebElement country;
	 
	 @FindBy(xpath="//input[@id='userProfile_City']")
	 WebElement city;
	 
	 @FindBy(xpath="//input[@id='userProfile_LinkedInURl']")
	 WebElement linkedInUrl;
	 
	 @FindBy(xpath="//select[@id='ExperiencesDropdown']")
	 WebElement experience;
	 
	 @FindBy(xpath="//button[@id='postBenchProfileSubmit']")
	 WebElement update;
	 
	 
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
	 
	 public void BenchProfile() {
		 profile.click();
	 }
	 
	 public void RecName(String name) {
		 recruiterName.sendKeys(name);
	 }
	 public void RecMail(String email) {
		 recEmail.sendKeys(email);
	 }
	 public void RecCode(String code) {
		 codes.sendKeys(code);
	 }
	 public void RecContact(String contact) {
		 contactNum.sendKeys(contact);
	 }
	 public void WhattsAppNum(String wtsAppNum) {
		 whattsApp.sendKeys(wtsAppNum);
	 }
	 public void RecCompanyName(String compName) {
		 companyName.sendKeys(compName);
	 }
	 public void RecState(String recState) {
		 state.sendKeys(recState);
	 }
	 public void RecCountry(String recCountry) {
		 country.sendKeys(recCountry);
	 }
	 public void RecCity(String recCity) {
		 city.sendKeys(recCity);
	 }
	 public void LinkedIn(String linked) {
		 linkedInUrl.sendKeys(linked);
	 }
	 public void RecExperience(String expe) {
		 experience.sendKeys(expe);
	 }
	 public void UpdateBtn(String updateBtn) {
		 update.sendKeys(updateBtn);
	 }
	
	
	
	

}
