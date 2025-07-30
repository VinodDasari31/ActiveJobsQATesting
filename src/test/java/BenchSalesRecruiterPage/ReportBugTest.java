package BenchSalesRecruiterPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReportBugTest 
{
	
	WebDriver driver;
	ReportBugPage report;
	
	@BeforeClass
	public void SetUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		report = new ReportBugPage(driver);
	}
	@Test
	void ReportBugsPage() 
	{
		
		report.header();
		report.layout();
		report.Email("vinodd.prajosh@gmail.com");
		report.Password("vinod");
		report.LoginBtn();
		report.ReportBug();
		report.SelectScreen("JobSeeker Screen");
		report.ReportEmail("Ab@gmail.com");
		report.Action("NO");
		report.Issue("no");
		report.Submit();
		
		
	}
	
	@AfterClass
	void TearDown() {
		driver.quit();
	
	}
}
