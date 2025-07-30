package ActiveJobsHomePageTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FiltersButtonPOMTestCase {
	
	WebDriver driver;
	
	FiltersPage filt;
	
	@BeforeClass
	public void setUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		filt = new FiltersPage(driver);
		
	}
	@Test(priority =1)
	void Filters() 
	{
		//FiltersPage filt =  new FiltersPage(driver);
		filt.ActFilters();
		
		filt.CtwoC();
		filt.FullTime();
		filt.Hybrid();
		filt.Remote();
		filt.OnSite();
		
		Assert.assertTrue(filt.isCheckboxEnabled(), "Checkbox is disabled");
	}
	
/*	@Test(priority = 2)
	void testCheckboxClick() 
	{
		if(filt.isCheckboxEnabled()) {
			filt.clickCheckbox();
			Assert.assertTrue(filt.isCheckboxSelected(), "Checkbox clicked");
		}
		else {
			System.out.println("Checkbox is disabled, cannot click");
		}
	}
	@Test(priority = 3)
	void fullTimeClick() {
		if(filt.fullTimeCheckboxEnabled()) {
			filt.FullTime();
			Assert.assertTrue(filt.fullTimeCheckboxSelected(), "Checkbox was not clicked");
		}
		else {
			System.out.println("Checkbox is disabled, cannot click");
		}
	}
	@Test(priority = 4)
	void hybridClick() {
		if(filt.hybridChkBxEnabled()) {
			filt.Hybrid();
			Assert.assertTrue(filt.hybridChkBxSelected(), "Checkbox not clicked");
		}
		else {
			System.out.println("Checkbox is disabled, cannot click");
		}
		
	}
	@Test(priority = 5)
	void remoteClick() {
		if(filt.remoteChkBxEnabled()) {
			filt.Remote();
			Assert.assertTrue(filt.remoteChkBxSelected(), "Checkbox not clicked");
		}
		else {
			System.out.println("Checkbox is disabled, cannot click");
		}
	}
	@Test(priority = 6)
	void onsiteClick() {
		if(filt.onSitechkbxEnabled()) {
			filt.OnSite();
			Assert.assertTrue(filt.onSitechkbxSelected(), "Checkbox  not clicked");
		}
		else {
			System.out.println("Checkbox is disabled, cannot click");
		}
	} */
	
	@AfterClass
	void TearDown() 
	{
		driver.close();
	}

}
