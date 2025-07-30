package BenchSalesRecruiterPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ViewDataTest 
{

	WebDriver driver;
	
	ViewDataPage viewPage;
	
	@BeforeClass
	public void SetUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		viewPage = new ViewDataPage(driver);
	}
	
	@Test
	void BulkPageTestCase() 
	{
		viewPage.header();
		viewPage.layout();
		viewPage.Email("vinodd.prajosh@gmail.com");
		viewPage.Password("vinod");
		viewPage.LoginBtn();
		
		viewPage.DataCollection();
		viewPage.ViewDataRecord();
		
		
		Assert.assertEquals("Bench Sales Data", "Bench Sales Data", "Successful");
		
	}
	@AfterClass
	void TearDown() {
		driver.close();
	}


}
