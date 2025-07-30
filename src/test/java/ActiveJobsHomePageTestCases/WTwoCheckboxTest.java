package ActiveJobsHomePageTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WTwoCheckboxTest {
	
	WebDriver driver;
	
	WTwoCheckBoxPage wtochkbx;
	
	
		@BeforeClass
		public void SetUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		wtochkbx = new WTwoCheckBoxPage(driver);
	}
		
	@Test(priority = 1)
	void Checkbox() {
		wtochkbx.ActFilters();
		wtochkbx.WTwoCheckbox();
		
		Assert.assertTrue(wtochkbx.isCheckboxEnabled(), "Checkbox is Enabled");
	}
	
	/*@Test(priority = 2)
	void WTwoCheckbox() {
		if(wtochkbx.isCheckboxEnabled()) {
			
			wtochkbx.WTwoCheckbox();

			Assert.assertTrue(wtochkbx.isCheckboxSelected(), "Checkbox not clicked");
		}
		else {
			System.out.println("Checkbox disabled, cannot click");
		} 
	}  */
	@AfterClass
	void TearDown() {
		driver.close();
	}
	
	
}
