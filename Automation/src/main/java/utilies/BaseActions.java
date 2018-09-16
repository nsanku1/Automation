/**
 * 
 */
package utilies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author prokarma
 *
 */
public class BaseActions
{
	WebDriver driver;
	public  WebDriver  LaunchAppInBrowser() 
	{

		  String url = "http://demowebshop.tricentis.com/";
		  String browser = "Chrome";
		  
		  if (browser.equals("Chrome"))
		  {
			 System.setProperty("webdriver.chrome.driver", "src//test//resources//Drivers//chromedriver.exe");
			 this.driver = new ChromeDriver();
		  }
		  else if (browser.equals("firefox")) 
		  {
			  System.setProperty("webdriver.gecko.driver", "src//test//resources//Drivers//geckodriver.exe"); 
			  this.driver = new FirefoxDriver();
		  }
		  
		  else if (browser.equals("IE")) 
		  {
			  System.setProperty("webdriver.ie.driver", "src//test//resources//Drivers//IEDriverServer.exe");
			  DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
			  cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true); 
			  this.driver = new InternetExplorerDriver();
		  }
		  driver.get(url);
	  return driver;
	}
	

}
