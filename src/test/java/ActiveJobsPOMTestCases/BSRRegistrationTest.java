package ActiveJobsPOMTestCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BSRRegistrationTest 
{
	WebDriver driver;
	
	@BeforeClass
	public void setUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
	}
	
	@Test
	void BenchRegistration() 
	{
		BSRRegistrationPage bsr = new BSRRegistrationPage(driver);
		bsr.BsHeader();
		bsr.Registration();
		
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("document.body.style.zoom='50%'");
		
		bsr.RecruiterName("ABCD");
		
		bsr.recEmail("tthu@gmail.com");
		bsr.recPassword("abcd1234");
		bsr.recCnfPassword("abcd1234");
		bsr.recCompany("pt");
		bsr.recCodes("+1 (US)");
		bsr.recContactNo("7654323456");
		bsr.recLocation("gnt");
		bsr.recCountry("India");
		bsr.recSignUp();
		
		//Assert.assertEquals(driver.getTitle(),"Verify OTP - ActiveJobs.us");
		
		/*String title = driver.getTitle();
		String expectedTitle = "Verify OTP - ActiveJobs.us";
		
		if(title.equals(expectedTitle)) {
			System.out.println("Title Matches: Success");
		}
		else {
			System.out.println("Title Not Match: Fail");
		} */
		
	}
	@AfterClass
	public void TearDown() {
		driver.close();
	}
}
