package ActiveJobsPOMTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployerLoginPage 
{
	WebDriver driver;
	
	// Constructor
	
	EmployerLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	@FindBy(css="a#Employerlogin")
	WebElement EmpHeader;
	
	@FindBy(xpath="//a[@id='emplogin']")
	WebElement EmpLayout;
	
	@FindBy(css=".form-control text-box single-line")
	WebElement Empmail;
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement EmpPassword;
	
	@FindBy(xpath="//button[@id='UserLogin']")
	WebElement EmpLoginBtn;
	
	// Action Method
	
	public void EmployerHeader() {
		EmpHeader.click();
	}
	public void EmployerLayout() {
		EmpLayout.click();
	}
	public void EmployerMail(String mail) {
		Empmail.sendKeys(mail);
	}
	public void EmployerPassword(String Psw) {
		EmpPassword.sendKeys(Psw);
	}
	public void EmployerLoginBtn() {
		EmpLoginBtn.click();
	}
	
}
