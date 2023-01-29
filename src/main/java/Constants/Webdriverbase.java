package Constants;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.testng.Assert.*;

public class Webdriverbase {
	
	 public static WebDriver driver;
	  protected boolean acceptNextAlert = true;
	  protected StringBuffer verificationErrors = new StringBuffer();
	  protected WebDriverWait wait;

	  
	 @Parameters ({"browser"}) 
	  public void webDriverSetUp(String browser) throws Exception {
	    if (browser.equals("Firefox")) {
	      WebDriverManager.firefoxdriver().setup();
	      driver = new FirefoxDriver();

	    } else if (browser.equals("Chrome")) {
	      WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();

	    } else if (browser.equals("Edge")) {

	      WebDriverManager.edgedriver().setup();
	      driver = new EdgeDriver();

	    	}
	    }
	    public static void assertEqualsByText(String expectedValue, String actualValue) throws Throwable {
	    	//The functionality of this method is to see what the expected value and the actual value in a case don't match and to have the best point of view to check the possible error  
	        try {

	          assertEquals(expectedValue, actualValue);
	        } catch (AssertionError ex) {
	          throw new AssertionError("*********** The expected value is: '" + expectedValue
	              + "'  but is not equal to the actual value: '" + actualValue + " ' please check the ***********\n");

	        }
	      }

	 }

