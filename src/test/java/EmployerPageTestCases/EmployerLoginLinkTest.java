package EmployerPageTestCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployerLoginLinkTest {
	
	WebDriver driver;
	EmployerLoginLinkPage empPage;
	
	@BeforeClass
	public void SetUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://uatapp.activejobs.us/Employeer/EmployerSignUp");
		driver.manage().window().maximize();
		
		empPage = new EmployerLoginLinkPage(driver);
	}
	
	@Test(priority=2)
	public void LoginLink() 
	{
		
		empPage.LoginLink();
		
	} 
	
	@Test(priority=1)
	public void EmpLogLink() {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("document.body.style.zoom='50%'");
		
		empPage.EmpLoginLink();
	}
	
	@AfterClass
	void TearDown() {
		
		driver.close();
		
	}

}
