package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.BSRegistrationCancelBtn;
import pageObjects.BSRegistrationPage;
import pageObjects.HomeElements;
import setup.BrowserPage;

public class BSRegistrationCancelTest extends BrowserPage {
	
	
	@Test
	public void Bsr_Reg_CancelButton() {
		
		logger.info("***** Starting RegitestClass *****");
		
		HomeElements hem = new HomeElements(driver);
		hem.BsHeader();
		logger.info("Clicked on my Header..");
		hem.Registration();
		logger.info("Clicked on My RegisterLink..");
		
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("document.body.style.zoom='50%'"); 
	       
	  BSRegistrationCancelBtn bsr = new BSRegistrationCancelBtn(driver);
	    
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
		//bsr.recSignUp();
		bsr.recCancel();
		
		
		// Logic 
		
		/*LogicPage lg = new LogicPage(driver);
		boolean target = lg.IsLinkExists();
		Assert.assertTrue(target); */
		logger.info("\"***** Cancelled All Given Text fields *****\"");
	}
	
	

}
