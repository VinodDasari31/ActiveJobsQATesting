package BenchSalesRecruiterPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BulkDataTest 
{
	WebDriver driver;
	BulkDataPage bulkPage;
	
	@BeforeClass
	public void SetUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		bulkPage = new BulkDataPage(driver);
	}
	
	@Test
	void BulkPageTestCase() 
	{
		bulkPage.header();
		bulkPage.layout();
		bulkPage.Email("vinodd.prajosh@gmail.com");
		bulkPage.Password("vinod");
		bulkPage.LoginBtn();
		
		bulkPage.DataCollectionDropDown();
		bulkPage.BulkData();
		bulkPage.FileUpload();
		bulkPage.ManualEnter();
		//bulkPage.EnterNumber("5");
		//bulkPage.RowsButton();
		//bulkPage.Delete();
		
		bulkPage.AddData("bcd");
		bulkPage.Mail("bcd@gmail.com");
		bulkPage.Company("Pt");
		bulkPage.Submit();
		
		Assert.assertEquals("Efficient Bench Multiple Data Entry - Streamline Your Processes", "Efficient Bench Multiple Data Entry - Streamline Your Processes","Successful");
	}
	
	@AfterClass
	void TearDown() {
		driver.close();
		
	}
}
