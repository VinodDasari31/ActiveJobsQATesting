package BenchSalesRecruiterPage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BulkEmailTest 
{

WebDriver driver;
	
	BulkEmailsPage bulkEmail;
	
	@BeforeClass
	public void SetUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		//driver.manage().window().setSize(new Dimension(1366, 768)); 
		driver.manage().window().maximize();
		
		// 🔍 Reduce screen zoom to 80%
     //   JavascriptExecutor js = (JavascriptExecutor) driver;
      //  js.executeScript("document.body.style.zoom='50%'");
		
		bulkEmail = new BulkEmailsPage(driver);
	}
	
	@Test
	void BulkEmailsTestCases() 
	{
		bulkEmail.header();
		bulkEmail.layout();
		bulkEmail.Email("vinodd.prajosh@gmail.com");
		bulkEmail.Password("vinod");
		bulkEmail.LoginBtn();
		
		bulkEmail.BulkEmail();
		bulkEmail.AddEmail();
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='65%'"); 
		
		bulkEmail.Subject("Tester");
		bulkEmail.Body("Hi");
		
		bulkEmail.BulkEmails("Abcd@gmail.com");
		
		bulkEmail.Submit();
			
}
	@AfterClass
	void TearDown() {
		driver.close();
	}  
}
