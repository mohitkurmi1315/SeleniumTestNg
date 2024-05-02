package testScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumGrid_RemoteDriverTest {
	WebDriver driver;
  @Test
  public void test() throws MalformedURLException {
	  
	  ChromeOptions options = new ChromeOptions();
	  options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	  String StrHub = "http://172.31.10.36:4444";
	  driver = new RemoteWebDriver(new URL(StrHub), options);
	  driver.get("https://www.google.com");
	    WebElement srcbox = driver.findElement(By.id("APjFqb"));
	    srcbox.sendKeys("Selenium tutorial");
	    srcbox.sendKeys(Keys.ENTER);
	    Assert.assertEquals(driver.getTitle(),"Selenium tutorial - Google Searchh");
	    System.out.println(driver.getTitle());
  }
}
