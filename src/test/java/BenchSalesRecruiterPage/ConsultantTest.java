package BenchSalesRecruiterPage;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConsultantTest 
{
	WebDriver driver;
	ConsultantPage consultantPage;
	
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
		
		consultantPage = new ConsultantPage(driver);
	}
	
	@Test
	void ConsultantPageTestCases() 
	{
		consultantPage.header();
		consultantPage.layout();
		consultantPage.Email("vinodd.prajosh@gmail.com");
		consultantPage.Password("vinod");
		consultantPage.LoginBtn();
		
		consultantPage.Consultant();
		consultantPage.AddConsultant();
		
		// 🔍 Reduce screen zoom to 80%
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='65%'");
        
		consultantPage.JobTitle("DSA");
		consultantPage.ConsultantName("vinod");
		consultantPage.ConEmail("abcd@gmail.com");
		consultantPage.Codes("+91 (IN)");
		consultantPage.ContactNumber("987654321234");
		consultantPage.State("Alaska");
		consultantPage.City("Alaska");
		consultantPage.Skills("Java");
		consultantPage.Visa("GC EAD");
		consultantPage.Relocation();
		consultantPage.Experience("2");
		consultantPage.Hybrid();
		consultantPage.OnSite();
		consultantPage.Remote();
		consultantPage.LinkedIn("NA");
		//consultantPage.StateExperience("2");
		consultantPage.StateExperienceNo();
		consultantPage.UploadResume("C:\\Users\\HP\\Downloads//VinodBabuDasari.pdf");
		consultantPage.SubmitButton();
	}
		
		@AfterClass
		void TearDown() {
			driver.close();
		}
		

}
