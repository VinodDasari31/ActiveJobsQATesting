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

public class EmployerRegistrationTest 
{
	WebDriver driver;
	
	@BeforeClass
	public void setUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
	}
	@Test
	void EmployerRegistration() 
	{
		EmployerRegistrationPage emp = new EmployerRegistrationPage(driver);
		
		emp.EmpHeader();
		emp.EmpLayout();
		 
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("document.body.style.zoom='70%'");
		
		emp.EmpName("xyzv");
		emp.EmpMail("000sddfa@gmail.com");
		emp.EmpPassword("123456");
		emp.EmpcPassword("123456");
		emp.EmpCompanyName("Pt");
		emp.EmpCodes("+1 (US)");
		emp.EmpNumber("9876543212");
		emp.EmpCountry("USA");
		emp.EmpState("Alaska");
		emp.EmpCompanyUrl("NA");
		
		emp.EmpSignUp();
		
	}
	
	@AfterClass
	void TearDown() {
		
		driver.quit();
	}

}
