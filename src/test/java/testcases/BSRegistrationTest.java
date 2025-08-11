package testcases;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BSRegistrationPage;
import pageObjects.HomeElements;
import pageObjects.LogicPage;
import setup.BrowserPage;


public class BSRegistrationTest extends BrowserPage {
	
	@Test
	public void BSRRegi_TC_1(){
		
		logger.info("***** Starting RegitestClass *****");
		
		HomeElements hem = new HomeElements(driver);
		hem.BsHeader();
		logger.info("Clicked on my Header..");
		hem.Registration();
		logger.info("Clicked on My RegisterLink..");
		
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("document.body.style.zoom='50%'"); 
	       
	    BSRegistrationPage bsr = new BSRegistrationPage(driver);
	    
		logger.info("providing customer Details");
		bsr.RecruiterName(randomString().toUpperCase());
		
		bsr.recEmail(randomString()+"@gmail.com");
		
		String password = randomAlphaNumberic();
		bsr.recPassword(password);
		bsr.recCnfPassword(password);
		bsr.recCompany("pt");
		bsr.recCodes("+1 (US)");
		bsr.recContactNo(mobileNumber());
		bsr.recLocation("gnt");
		bsr.recCountry("India");
		//bsr.recCaptcha();
		bsr.recSignUp();
		
		
		// Logic 
		
		/*LogicPage lg = new LogicPage(driver);
		boolean target = lg.IsLinkExists();
		Assert.assertTrue(target); */
		logger.info("\"***** Finished RegitestClass *****\"");
		
		
	}

}
