package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeElements extends ConstructorPage {
	
	WebDriver driver;
	
	public HomeElements(WebDriver driver){
		super(driver);
	}
	
	// Locators From BenchSales
	
	 @FindBy(xpath= "//a[@id = 'benchlogin']")
	WebElement Header;
			 
	 @FindBy(xpath= "//a[@id='benchregister']")
	WebElement BsRegistration;
			 
	 @FindBy(xpath="//a[@id='benchlayoutlogin']")
	 WebElement BsrLogin;
	 
	 
	// Action Methods For BenchSales
		
		public void BsHeader() {
		Header.click();
		}
					
		public void Registration() {
		BsRegistration.click();
		}
		public void Login() {
		BsrLogin.click();
		}
		
	 
	 // Locators From EmployerPage
	 
	 @FindBy (xpath="//a[@id='Employerlogin']")
	WebElement empHeader;
		
	@FindBy (xpath="//a[@id='empreg']")
	WebElement empLayout;
			 
	
	// Action Methods For EmployerPage
	
	public void EmpHeader() {
		empHeader.click();
		
	}
	
	public void EmpLayout() {
		empLayout.click();
		
	}
	

}
