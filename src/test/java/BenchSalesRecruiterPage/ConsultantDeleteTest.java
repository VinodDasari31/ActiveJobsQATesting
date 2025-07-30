package BenchSalesRecruiterPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConsultantDeleteTest 
{
	WebDriver driver;
	
	ConsultantDeletePage delete;
	
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
		
		delete = new ConsultantDeletePage(driver);
	}
	
	@Test
	void ConsultantDeleteTestCases() 
	{
		delete.header();
		delete.layout();
		delete.Email("vinodd.prajosh@gmail.com");
		delete.Password("vinod");
		delete.LoginBtn();
		
		delete.Consultant();
		delete.Delete();
		delete.ConfirmDelete();
		
		
	
}
	@AfterClass
	void TearDown() {
		driver.close();
	} 
	
}
