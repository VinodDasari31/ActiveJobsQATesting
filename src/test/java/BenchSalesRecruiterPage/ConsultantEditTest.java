package BenchSalesRecruiterPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConsultantEditTest 
{
	WebDriver driver;
	ConsultantEditPage consultanteditPage;
	
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
		
		consultanteditPage = new ConsultantEditPage(driver);
	}
	
	@Test
	void ConsultantPageTestCases() 
	{
		consultanteditPage.header();
		consultanteditPage.layout();
		consultanteditPage.Email("vinodd.prajosh@gmail.com");
		consultanteditPage.Password("vinod");
		consultanteditPage.LoginBtn();
		
		consultanteditPage.Consultant();
		consultanteditPage.Edit();
		
		
	
}
	@AfterClass
	void TearDown() {
		driver.close();
	} 
	
}
