package ActiveJobsHomePageTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class ViewButtonTest {
    WebDriver driver;
    ViewButtonPage viewButton;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://uatapp.activejobs.us/");
        driver.manage().window().maximize();

        viewButton = new ViewButtonPage(driver);
    }

    @Test
    public void testViewAndApplyButton() {
        viewButton.clickViewButton();
        viewButton.clickApplyButton();
        
        Assert.assertEquals("Job Seeker Login - Access Your Opportunities at ActiveJobs.us", "Job Seeker Login - Access Your Opportunities at ActiveJobs.us", "Successful");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    } 
}
