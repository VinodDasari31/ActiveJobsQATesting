package ActiveJobsHomePageTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ResendOtpTest 
{
WebDriver driver;
	
ResendOtpPage rsnd;
	
	@BeforeClass
	void setUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		rsnd = new ResendOtpPage(driver);
	}
	@Test
	void ForgotPage() 
	{
		
		rsnd.header();
		rsnd.layout();
		rsnd.ForgotLink();
		rsnd.TextBox("vinodd.prajosh@gmail.com");
		rsnd.SendBtn();
		//rsnd.ResendOtp();
		
			}
	@AfterClass
	void TearDown() {
		driver.close();
	}
}
