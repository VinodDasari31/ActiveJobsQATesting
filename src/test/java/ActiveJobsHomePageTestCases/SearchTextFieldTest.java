package ActiveJobsHomePageTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTextFieldTest {
	
	WebDriver driver;
	SearchTextFieldPage searchText;
	
	// SetUp
	@BeforeClass
	public void SetUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		searchText = new SearchTextFieldPage(driver);
		
	}
	@Test
	void SearchJob() 
	{
		searchText.SearchBox("Java");
		//searchText.Text("Java");
		searchText.FindBtn();
		
		Assert.assertEquals("Full Time, C2C Jobs and Contract Jobs in USA - ActiveJobs", "Full Time, C2C Jobs and Contract Jobs in USA - ActiveJobs", "Page does not Match");
		
	/*	String job = driver.getTitle();
		String expected = "Full Time, C2C Jobs and Contract Jobs in USA - ActiveJobs";
		
		if(job.equals(expected)) {
			System.out.println("Title Match:" + "Successfull");
		}
		else {
			System.out.println("Title Match:"+ "Fail");
		} */
		
		
		
	}
	@AfterClass
	void TearDown() {
		driver.close();
	} 
	

}
