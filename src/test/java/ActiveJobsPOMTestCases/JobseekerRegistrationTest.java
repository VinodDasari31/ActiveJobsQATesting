package ActiveJobsPOMTestCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobseekerRegistrationTest {
	
	WebDriver driver;
	JobSeekerRegistrationPage scrollPage;
	@BeforeClass
	public void SetUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		 // Initialize Page Object
        scrollPage = new JobSeekerRegistrationPage(driver);
	}
	
	
	
	@Test(priority = 2)
	void JobseekerTest()
	{
		JobSeekerRegistrationPage jsrPage = new JobSeekerRegistrationPage(driver);
		jsrPage.JsrHeader();
		jsrPage.JsrLayout();
		
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("document.body.style.zoom='50%'");
		
		jsrPage.UserName("Asdf");
		jsrPage.Email("tyhf@gmail.com");
		jsrPage.Password("abcd1234");
		jsrPage.CnfPassword("abcd1234");
		//jsrPage.DateOfBirth("12/12/2000");
		//jsrPage.SignUpBtn();
		
	}
	
	@AfterClass
	void TearDown() {
		driver.close();
	}

}
