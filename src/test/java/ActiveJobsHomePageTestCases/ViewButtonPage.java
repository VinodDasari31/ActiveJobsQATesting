package ActiveJobsHomePageTestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ViewButtonPage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    // Constructor
    public ViewButtonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
    }

    // Locators
  //  @FindBy(xpath = "//a[@id='homeviewjob']")
   // WebElement viewBtn;

   // @FindBy(xpath = "//a[@class='apply-button']")
   // WebElement applyBtn;

    // Scroll to element
    public void scrollToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
        
        
        
    }
    // Locators
    @FindBy(xpath = "//a[@id='homeviewjob']")
    WebElement viewBtn;
    
    @FindBy(xpath = "//a[@class='apply-button']")
    WebElement applyBtn;


    // Click View Button
    public void clickViewButton() {
        scrollToElement(viewBtn);
        wait.until(ExpectedConditions.elementToBeClickable(viewBtn)).click();
        System.out.println("Clicked on View Button.");
    }

    // Click Apply Button
    public void clickApplyButton() {
        scrollToElement(applyBtn);
        wait.until(ExpectedConditions.elementToBeClickable(applyBtn)).click();
        System.out.println("Clicked on Apply Button.");
    }
}
