package BenchSalesRecruiterPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChangePasswordTest 
{
	WebDriver driver;
	
	ChangePasswordPage changePsw;
	
	@BeforeClass
	public void SetUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		changePsw = new ChangePasswordPage(driver);
	}
	
	@Test
	void ChangePasswordTestCase() 
	{
		changePsw.header();
		changePsw.layout();
		changePsw.Email("vinodd.prajosh@gmail.com");
		changePsw.Password("vinod");
		changePsw.LoginBtn();
		
		changePsw.ChangePswDropDown();
		changePsw.OldPassword("vinod");
		changePsw.NewPassword("vinod");
		changePsw.ConfirmPassword("vinod");
		changePsw.UpdateButton();
		
		Assert.assertEquals("Change Your Password - Secure Your Bench Account", "Change Your Password - Secure Your Bench Account", "Successful");
		
	}
	@AfterClass
	void TearDown() {
		driver.close();
	}

}
