package ActiveJobsPOMTestCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomeElements;
import setup.BrowserPage;

public class EmployerRegistrationTest extends BrowserPage
{
	
	
	/*@BeforeClass
	public void setUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
	}  */
	@Test
	public void EmployerRegistration() 
	{
		//EmployerRegistrationPage emp = new EmployerRegistrationPage(driver);
		
		HomeElements emply = new HomeElements(driver);
		emply.EmpHeader();
		emply.EmpLayout();
		EmployerRegistrationPage emp = new EmployerRegistrationPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("document.body.style.zoom='70%'");
		
		emp.EmpName(randomString().toUpperCase());
		emp.EmpMail(randomString()+"@gmail.com");
		String password = randomAlphaNumberic();
		emp.EmpPassword(password);
		emp.EmpcPassword(password);
		emp.EmpCompanyName("Pt");
		emp.EmpCodes("+1 (US)");
		emp.EmpNumber(mobileNumber());
		emp.EmpCountry("USA");
		emp.EmpState("Alaska");
		emp.EmpCompanyUrl("NA");
		
		emp.EmpSignUp();
		
	}
	
	/*@AfterClass
	void TearDown() {
		
		driver.quit();
	} */

}
