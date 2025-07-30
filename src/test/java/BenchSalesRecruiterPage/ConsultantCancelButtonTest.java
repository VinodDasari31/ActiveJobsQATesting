package BenchSalesRecruiterPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConsultantCancelButtonTest 
{
WebDriver driver;
	
	ConsultantCancelButtonPage cancelBtn;
	
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
		
		cancelBtn = new ConsultantCancelButtonPage(driver);
	}
	
	@Test
	void ConsultantCancelTestCases() 
	{
		cancelBtn.header();
		cancelBtn.layout();
		cancelBtn.Email("vinodd.prajosh@gmail.com");
		cancelBtn.Password("vinod");
		cancelBtn.LoginBtn();
		
		cancelBtn.Consultant();
		cancelBtn.Delete();
		cancelBtn.CancelButton();
		
		
	
}
	@AfterClass
	void TearDown() {
		driver.close();
	} 
}
