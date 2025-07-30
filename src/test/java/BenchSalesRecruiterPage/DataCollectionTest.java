package BenchSalesRecruiterPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataCollectionTest {
	WebDriver driver;
	
	DataCollectionPage singlePage;
	
	@BeforeClass
	public void SetUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		singlePage = new DataCollectionPage(driver);
	}
	
	@Test
	void BulkPageTestCase() 
	{
		singlePage.header();
		singlePage.layout();
		singlePage.Email("vinodd.prajosh@gmail.com");
		singlePage.Password("vinod");
		singlePage.LoginBtn();
		
		singlePage.DataCollection();
		singlePage.SingleRecord();
		singlePage.SingleEmail("vinodd.prajosh@gmail.com");
		singlePage.Name("vinod");
		singlePage.CompanyName("pt");
		singlePage.Submit();
		
		Assert.assertEquals("ActiveJobs - Enter Consultant or Employer Information for Bench Placement Opportunities", "ActiveJobs - Enter Consultant or Employer Information for Bench Placement Opportunities", "Successful");
		
	}
	@AfterClass
	void TearDown() {
		driver.close();
	}


}
