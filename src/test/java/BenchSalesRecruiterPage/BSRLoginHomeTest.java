package BenchSalesRecruiterPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ActiveJobsPOMTestCases.BSRLoginPage;

public class BSRLoginHomeTest 
{
	WebDriver driver;
	BSRHomePage loginHomePage;
	
	@BeforeClass
	public void SetUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		loginHomePage = new BSRHomePage(driver);
	}
	@Test
	void BsrLoginPage() 
	{
		
		loginHomePage.header();
		loginHomePage.layout();
		loginHomePage.Email("vinodd.prajosh@gmail.com");
		loginHomePage.Password("vinod");
		loginHomePage.LoginBtn();
		
		
		Assert.assertEquals(driver.getTitle(),("Full Time, C2C Jobs and Contract Jobs in USA - ActiveJobs"));
	}
	@Test
	void Logout() {
		loginHomePage.LogOut();
	}
	@AfterClass
	void TearDown() {
		driver.quit();
	
	}
}
