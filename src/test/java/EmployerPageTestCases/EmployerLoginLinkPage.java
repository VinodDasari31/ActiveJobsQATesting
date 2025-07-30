package EmployerPageTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployerLoginLinkPage 
{

	// CONSTRUCTOR
	
	WebDriver driver;
	 
	EmployerLoginLinkPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	// LOCATORS
	
	@FindBy(xpath="//a[@id='EmploginLink']")
	WebElement empLogin; 
	
	@FindBy(xpath="//a[@id='empSignupalredyacc']")
	WebElement login;
	
	// Action Method
	
	public void LoginLink() {
		empLogin.click();
	} 
	
	public void EmpLoginLink() {
		login.click();
	}
	
}

