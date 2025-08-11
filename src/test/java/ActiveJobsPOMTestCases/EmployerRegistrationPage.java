package ActiveJobsPOMTestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageObjects.ConstructorPage;

public class EmployerRegistrationPage extends ConstructorPage
{
	// WebDriver driver;
	
	//Constructor
	public EmployerRegistrationPage(WebDriver driver)
	{
		
		super(driver);
		//this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	// Locators
	
	
	@FindBy (xpath="//input[@id='EmpName']")
	WebElement empName;
	
	@FindBy (xpath="//input[@id='CompnayEmailIdSignup']")
	WebElement email;
	
	@FindBy (xpath="//input[@id='Password']")
	WebElement password;
	
	@FindBy (xpath="//input[@id='RePassword']")
	WebElement conPassword;
	
	@FindBy (xpath="//input[@id='CompanyName']")
	WebElement companyName;
	
	@FindBy (xpath="//*[@id='CallingCodeDropdown']")
	WebElement codes;
	
	@FindBy (xpath="//input[@id='MobileNo']")
	WebElement number;
	
	@FindBy (xpath="//*[@id='Country']")
	WebElement country;
	
	@FindBy (xpath="//*[@id='StatesDropdown']")
	WebElement state;
	
	@FindBy (xpath="//*[@id='CompanyUrl']")
	WebElement companyUrl;
	
	@FindBy (xpath="//button[@id='empSignupsubmit']")
	WebElement empSignup;
	
	/*@FindBy (xpath="//button[@id='empSignupsubmit']")
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement signUpBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='empSignupsubmit']"))); */
	
	// Action Methods
	
	
	public void EmpName(String name) {
		empName.sendKeys(name);
		
	}
	public void EmpMail(String mail) {
		email.sendKeys(mail);
	}
	public void EmpPassword(String emppassword) {
		password.sendKeys(emppassword);
	}
	public void EmpcPassword(String cPassword) {
		conPassword.sendKeys(cPassword);
	}
	public void EmpCompanyName(String company) {
		companyName.sendKeys(company);
	}
	public void EmpCodes(String countryCodes) {
		codes.sendKeys(countryCodes);
	}
	public void EmpNumber(String PhoneNumber) {
		number.sendKeys(PhoneNumber);
	}
	public void EmpCountry(String Country) {
		country.sendKeys(Country);
	}
	public void EmpState(String State) {
		state.sendKeys(State);
	}
	public void EmpCompanyUrl(String CompanyUrl) {
		companyUrl.sendKeys(CompanyUrl);
	}
	public void EmpSignUp() {
		empSignup.click();
	}
}
