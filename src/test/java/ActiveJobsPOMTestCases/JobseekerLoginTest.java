package ActiveJobsPOMTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobseekerLoginTest 
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
	void Jobseeker() 
	{
		JobSeekerLoginPage login = new JobSeekerLoginPage(driver);
		login.JslHeader.click();
		login.JslLayout.click();
		login.JslEmail.sendKeys("vinodd.prajosh@gmail.com");
		login.JslPassword.sendKeys("vinod");
		login.JslLoginBtn.click();
		
		Assert.assertEquals(driver.getTitle(), "Vinod Dasari Java with Selenium - Job Seeker Profile - ActiveJobs.us");
	}
	@AfterClass
	void TestClose() {
		driver.quit();
	}
}
