package ActiveJobsHomePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageOpen 
{
	WebDriver driver;
	
	/* HomePageOpen(WebDriver driver)
	{
		
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	} */
	
	 public HomePageOpen() {
	        // Default constructor required by TestNG
	    }
	
	@BeforeClass
	void setUp() 
	{
		 //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Optional if ChromeDriver is not in PATH
		 	driver = new ChromeDriver();
	        driver.get("https://uatapp.activejobs.us/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
		
	}
	@Test
	void PageOpen() 
	{
		/*WebElement key = driver.findElement(By.name("q"));
		key.sendKeys("activeJobs");
		key.sendKeys(Keys.ENTER); */
		
		/*WebElement pageTitle = driver.findElement(By.xpath(""));
		pageTitle.click(); */
		
		
		
		String homePage = driver.getTitle();
		String expectedTitle = "Full Time, C2C Jobs and Contract Jobs in USA - ActiveJobs";
		
		if(homePage.equals(expectedTitle)) {
			System.out.println("Title Matches: Success");
			
		}
		else {
			System.out.println("Title Not Match: Fail");
		}
		
		
		
	}
	@AfterClass
	void TearDown() {
		driver.close();
	}
	
}
	


