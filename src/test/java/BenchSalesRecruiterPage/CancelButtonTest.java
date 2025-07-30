package BenchSalesRecruiterPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CancelButtonTest {
	
WebDriver driver;
	
ChangePasswordCancelBtnPage cancelButton;
	
	@BeforeClass
	public void SetUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		cancelButton = new ChangePasswordCancelBtnPage(driver);
	}
	
	@Test
	void ChangePasswordTestCase() 
	{
		cancelButton.header();
		cancelButton.layout();
		cancelButton.Email("vinodd.prajosh@gmail.com");
		cancelButton.Password("vinod");
		cancelButton.LoginBtn();
		
		cancelButton.ChangePswDropDown();
		cancelButton.OldPassword("vinod");
		cancelButton.NewPassword("vinod");
		cancelButton.ConfirmPassword("vinod");
		cancelButton.CancelButton();
		
		Assert.assertEquals("Change Your Password - Secure Your Bench Account", "Change Your Password - Secure Your Bench Account", "Successful");
		
	}
	@AfterClass
	void TearDown() {
		driver.close();
	}



}
