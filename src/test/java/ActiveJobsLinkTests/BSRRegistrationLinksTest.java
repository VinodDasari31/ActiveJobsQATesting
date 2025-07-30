package ActiveJobsLinkTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BSRRegistrationLinksTest 
{
	WebDriver driver;
	BSRRegistrationLinksPage links;
	
	@BeforeClass
	public void SetUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		links = new BSRRegistrationLinksPage(driver);
		
	}
	
	@Test
	void ClickLink() 
	{
		
		links.BsHeader();
		links.Registration();
		//links.scrollToElementAndClick();
		links.ClickHereLink();
	}
	
	@AfterClass
	void TearDown() {
		driver.close();
	}
}
