package ActiveJobsPageChangeTests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NextPageQATest 
{
	WebDriver driver;
	NextPageQAPage nextPage;
	JavascriptExecutor js;
	
	@BeforeClass
	public void SetUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();
		
		nextPage = new NextPageQAPage(driver);
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	}
	@Test
	void NextPage() 
	{
		//js.executeScript("window.scrollBy(0,500)");
		
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		nextPage.DownPage();
		nextPage.NextPage();
		
	}
	@AfterClass
	void TearDown() {
		//driver.close();
	}

}
