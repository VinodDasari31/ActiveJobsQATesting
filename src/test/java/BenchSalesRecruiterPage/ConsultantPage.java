package BenchSalesRecruiterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsultantPage 
{
	WebDriver driver;
	
	// Constructor
	
	ConsultantPage(WebDriver driver)
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
	 
	 @FindBy(xpath= "//a[@id='BSUResume']")
	 WebElement addConsultant;
	 
	 @FindBy(xpath="//input[@id='JobTitle']")
	 WebElement jobTitle;
	 
	 @FindBy(xpath="//input[@id='UserName']")
	 WebElement consultantName;
	 
	 @FindBy(xpath="//input[@id='EmailId']")
	 WebElement conEmail;
	 
	 @FindBy(xpath="//select[@id='CallingCodeDropdown']")
	 WebElement codes;
	 
	 @FindBy(xpath="//input[@id='MobileNumber']")
	 WebElement contactNum;
	 
	 @FindBy(xpath="//select[@id='StatesDropdown']")
	 WebElement state;
	 
	 @FindBy(xpath="//input[@id='City']")
	 WebElement city;
	 
	 @FindBy(xpath="//input[@id='Primary_Skills']")
	 WebElement primarySkills;
	 
	 @FindBy(xpath="//select[@id='VisaCategoriesDropdown']")
	 WebElement visaType;
	 
	 @FindBy(xpath="//input[@id='RelocationYes']")
	 WebElement relocate;
	 
	 
	 
	 @FindBy(xpath="//input[@id='RelocationNo']")
	 WebElement noReclocation;
	 
	 @FindBy(xpath="//select[@id='ExperiencesDropdown']")
	 WebElement experience;
	 
	 @FindBy(xpath="//input[@id='hybridCheckbox']")
	 WebElement hybrid;
	 
	 @FindBy(xpath="//input[@id='remoteCheckbox']")
	 WebElement remote;
	 
	 @FindBy(xpath="//input[@id='onsiteCheckbox']")
	 WebElement onSite;
	 
	 @FindBy(xpath="//input[@id='LinkedInUrl']")
	 WebElement linked;
	 
	 @FindBy(xpath="//input[@id='StateExpYes']")
	 WebElement stateExp;
	 
	 @FindBy(xpath="//input[@id='StateExpNo']")
	 WebElement stateExpNo;
	 
	 @FindBy(xpath="//textarea[@id='StateExperience']")
	 WebElement exp;
	 
	 @FindBy(xpath="//input[@name='ResumeUploadFile']")
	 WebElement resume;
	 
	 @FindBy(xpath="//button[@id='consbenchSubmit']")
	 WebElement submitBtn;
	 
	 
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
	 
	 public void AddConsultant() {
		 addConsultant.click();
	 }
	 public void JobTitle(String title) {
		 jobTitle.sendKeys(title);
	 }
	 public void ConsultantName(String name) {
		 consultantName.sendKeys(name);
	 }
	 public void ConEmail(String email) {
		 conEmail.sendKeys(email);
	 }
	 public void Codes(String code) {
		 codes.sendKeys(code);
	 }
	 public void ContactNumber(String number) {
		 contactNum.sendKeys(number);
	 }
	 public void State(String recState) {
		 state.sendKeys(recState);
	 }
	 public void City(String sity) {
		 city.sendKeys(sity);
	 }
	 public void Skills(String skills) {
		 primarySkills.sendKeys(skills);
	 }
	 public void Visa(String visa) {
		 visaType.sendKeys(visa);
	 }
	 public void Relocation() {
		 relocate.click();
	 }
	 public void Experience(String exper) {
		 experience.sendKeys(exper);
	 }
	 
	 public void Hybrid() {
		 hybrid.click();
	 }
	 
	 public void OnSite() {
		 onSite.click();
	 }
	 
	 public void Remote() {
		 remote.click();
	 }
	 
	 public void LinkedIn(String linkedIn) {
		 linked.sendKeys(linkedIn);
	 }
	 
	 public void StateExperience() {
		 stateExp.click();
	 }
	 
	 public void StateExperienceNo() {
		 stateExpNo.click();
	 }
	 
	 public void UploadResume(String file) {
		 resume.sendKeys(file);
	 }
	 
	 public void SubmitButton() {
		 submitBtn.click();
	 }

}
