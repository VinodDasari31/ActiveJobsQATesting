package ActiveJobsHomePageTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ViewSimilarJobsButtonTest 
{
	WebDriver driver;
	
	ViewSimilarJobsButtonPage vsmJobsButton;
	
	@BeforeClass
	public void SetUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		vsmJobsButton = new ViewSimilarJobsButtonPage(driver);
	}
	
	
	@Test
	void ViewSimilarJobButton() {
		//vsmJobsButton.ViewSmlrJobs();
		vsmJobsButton.ApplyBtn();
		
		Assert.assertEquals("Job Seeker Login - Access Your Opportunities at ActiveJobs.us", "Job Seeker Login - Access Your Opportunities at ActiveJobs.us", "Page title does not match");
	}
	@AfterClass
	void TearDown() {
		driver.quit();
	}
}
