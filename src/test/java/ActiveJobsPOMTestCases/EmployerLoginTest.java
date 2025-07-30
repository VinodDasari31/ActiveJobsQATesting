package ActiveJobsPOMTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployerLoginTest 
{
	WebDriver driver;
	
	
	@BeforeClass
	void setUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
	}
	
	@Test
	void EmployerLogin() 
	{
		EmployerLoginPage empl = new EmployerLoginPage(driver);
		
		empl.EmpHeader.click();
		empl.EmpLayout.click();
		empl.Empmail.sendKeys("vinodd.prajosh@gmail.com");
		empl.EmpPassword.sendKeys("vinod");
		empl.EmpLoginBtn.click();
		
		Assert.assertEquals(driver.getTitle(), "Posted Jobs - Full Time, C2C, and Contract Jobs in USA - ActiveJobs");
		
	}
	@AfterClass
	void TearDown() {
		driver.quit();
	}
	
}
