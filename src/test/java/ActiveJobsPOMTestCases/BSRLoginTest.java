package ActiveJobsPOMTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BSRLoginTest {
	
	// Initiate WebDriver
	
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
	void BsrLoginPage() 
	{
		BSRLoginPage lp = new BSRLoginPage(driver);
		lp.header();
		lp.layout();
		lp.Email("vinodd.prajosh@gmail.com");
		lp.Password("vinod");
		lp.LoginBtn();
		
		Assert.assertEquals(driver.getTitle(),("Full Time, C2C Jobs and Contract Jobs in USA - ActiveJobs"));
	}
	@AfterClass
	void TearDown() {
		driver.quit();
	}

}
