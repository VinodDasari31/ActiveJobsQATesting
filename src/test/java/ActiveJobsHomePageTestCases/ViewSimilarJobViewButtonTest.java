package ActiveJobsHomePageTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ViewSimilarJobViewButtonTest 
{
WebDriver driver;
	
	ViewSimilarJobViewButtonPage vsmJobViewBtn;
	
	@BeforeClass
	public void SetUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		vsmJobViewBtn = new ViewSimilarJobViewButtonPage(driver);
	}
	@Test
	void ViewJobsButton() {
		vsmJobViewBtn.ViewJobBtn();
		vsmJobViewBtn.ViewJobs();
		
		Assert.assertEquals("Job Seeker Login - Access Your Opportunities at ActiveJobs.us", "Job Seeker Login - Access Your Opportunities at ActiveJobs.us", "Page title does not match");
	}
	@AfterClass
	void TearDown() {
		driver.close();
	}
}
