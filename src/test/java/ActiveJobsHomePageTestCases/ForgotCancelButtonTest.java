package ActiveJobsHomePageTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForgotCancelButtonTest 
{
	
WebDriver driver;
	
	ForgotCancelButtonPage forgotCancel;
	
	@BeforeClass
	void setUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		forgotCancel = new ForgotCancelButtonPage(driver);
	}
	@Test
	void ForgotPage() 
	{
		
		forgotCancel.header();
		forgotCancel.layout();
		forgotCancel.ForgotLink();
		forgotCancel.TextBox("vinodd.prajosh@gmail.com");
		forgotCancel.CancelBtn();
		
			}
	@AfterClass
	void TearDown() {
		driver.close();
	}
}
