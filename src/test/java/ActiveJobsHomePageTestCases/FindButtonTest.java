package ActiveJobsHomePageTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FindButtonTest 
{
	WebDriver driver;
	
	FindButtonPage findBtn;
	
	@BeforeClass
	public void SetUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
	    driver.manage().window().maximize();
	    
	    findBtn = new FindButtonPage(driver);
	}
	@Test
	void FindData() 
	{
		findBtn.SearchBar("Java");
		findBtn.FindButton();
	}
	@AfterClass
	void TearDown() {
		driver.close();
	} 
	
}
