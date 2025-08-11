package setup;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.Logger;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;

public class BrowserPage {
	
	public static WebDriver driver;
	public Logger logger;
	public Properties p;
	
		@BeforeClass
		@Parameters({"browser"})
		public void SetUp(String br) throws IOException {
			
			FileReader file = new FileReader("./src//test//resources//config.properties");
			p= new Properties();
			p.load(file);
			
		logger = LogManager.getLogger(this.getClass());
		
		// Browser Page using switch statement
		
		switch(br.toLowerCase())
		{
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge"  : driver = new EdgeDriver(); break;
		default : System.out.println("Inavlid Browser name"); return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("URL"));
		driver.manage().window().maximize();
		
	}
		@AfterClass
		public void TearDown() {
			driver.quit();
		}
		
		public String randomString() {
			String generatedString = RandomStringUtils.randomAlphabetic(7);
			return generatedString;
		}
		
		public String randomAlphaNumberic() {
			String generatedString = RandomStringUtils.randomAlphabetic(8);
			String generatednumber = RandomStringUtils.randomNumeric(8);
			return(generatedString+"@"+generatednumber);
		}
		
		public String mobileNumber() {
			String generatedString = RandomStringUtils.randomNumeric(10);
			return generatedString;
		}
		public String captureScreen(String tname) throws IOException {
			
			String timeStamp = new SimpleDateFormat("yyyyMMddHHss").format(new Date());
			
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
			
			String targetFilePath = System.getProperty("user.dir")+"\\screenshots\\"+tname+"_"+timeStamp + ".Png";
			File tagetFile = new File(targetFilePath);
			
			sourceFile.renameTo(tagetFile);
			
			return targetFilePath;
			
		}

}
