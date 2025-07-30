package ActiveJobsHomePageTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForgotTest 
{
	WebDriver driver;
	
	ForgotPasswordPage forgotPage;
	
	@BeforeClass
	void setUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		forgotPage = new ForgotPasswordPage(driver);
	}
	@Test
	void ForgotPage() 
	{
		
		forgotPage.header();
		forgotPage.layout();
		forgotPage.ForgotLink();
		forgotPage.TextBox("vinodd.prajosh@gmail.com");
		forgotPage.SendBtn();
		
		Assert.assertEquals(">Forgot OTP - Recover Your ActiveJobs.us Account", ">Forgot OTP - Recover Your ActiveJobs.us Account","Succeful");
		
	}
	@AfterClass
	void TearDown() {
		driver.close();
	}
	
}
