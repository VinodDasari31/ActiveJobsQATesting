package ActiveJobsPOMTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobSeekerLoginPage 
{
	WebDriver driver;
	
	// Constructor
	
	JobSeekerLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	
	@FindBy (xpath= "//a[@id='benchJob']")
	WebElement JslHeader;
	
	@FindBy (xpath="//a[@id='jobseekerloin']")
	WebElement JslLayout;
	
	@FindBy (xpath="//input[@name ='Email_Id']")
	WebElement JslEmail;
	
	@FindBy (xpath="//input[@id='Password']")
	WebElement JslPassword;
	
	@FindBy (xpath="//button[@id='UserLogin']")
	WebElement JslLoginBtn;
	
	// Action Method
	
	public void jobSeekerHeader() {
		JslHeader.click();
	}
	public void jobSeekerLayout() {
		JslLayout.click();
	}
	public void jobSeekerEmail(String email) {
		JslEmail.sendKeys(email);
	}
	public void jobSeekerPassword(String psw) {
		JslPassword.sendKeys(psw);
	}
	public void jobSeekerLgnBtn() {
		JslLoginBtn.click();
	}
}
