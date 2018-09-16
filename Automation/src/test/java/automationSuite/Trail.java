package automationSuite;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import pages.Landingpage;
import utilies.BaseActions;

public class Trail extends BaseActions{
	WebDriver driver;
  @Test
  public void f() 
  {
	  this.driver = LaunchAppInBrowser();
	  Landingpage LPage = new Landingpage(driver);
	  LPage.Register_link.click();
  }
  
  
}
