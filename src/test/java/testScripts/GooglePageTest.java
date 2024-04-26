package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GooglePageTest {
	WebDriver driver;
	@BeforeMethod
	public void setup () {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
  @Test (alwaysRun = true, dependsOnMethods = "seleniumSearchTest")
  public void javaSearchTest() {
	    
		driver.get("https://www.google.com");
	    WebElement srcbox = driver.findElement(By.id("APjFqb"));
	    srcbox.sendKeys("Java Tutorial");
	    srcbox.sendKeys(Keys.ENTER);
	    Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
//	    test for commit,,,,,
  }
  
  @Test(priority = 2)
  public void seleniumSearchTest() {
	    
		driver.get("https://www.google.com");
	    WebElement srcbox = driver.findElement(By.id("APjFqb"));
	    srcbox.sendKeys("Selenium tutorial");
	    srcbox.sendKeys(Keys.ENTER);
	    Assert.assertEquals(driver.getTitle(),"Selenium tutorial - Google Searchh");
	    System.out.println(driver.getTitle());
      
}
  
  @Test (priority = 3)
  public void appiumSearchTest() {
	    
		driver.get("https://www.google.com");
	    WebElement srcbox = driver.findElement(By.id("APjFqb"));
	    srcbox.sendKeys("appium tutorial");
	    srcbox.sendKeys(Keys.ENTER);
	    System.out.println(driver.getTitle());
	    Assert.assertEquals(driver.getTitle(),"appium tutorial - Google Search");
	    
      
}
  
  @Test(enabled = false)
  public void cucumberSearchTest() {
	    
		driver.get("https://www.google.com");
	    WebElement srcbox = driver.findElement(By.id("APjFqb"));
	    srcbox.sendKeys("Cucumber tutorial");
	    srcbox.sendKeys(Keys.ENTER);
	    Assert.assertEquals(driver.getTitle(),"Cucumber tutorial - Google Search");
	    System.out.println(driver.getTitle());
      
}
  
//  @Test
//  public void javaSearchTest1() {
//	    
//		driver.get("https://www.google.com");
//		SoftAssert softassert = new SoftAssert();
//		softassert.assertEquals(driver.getTitle(), "Google Page");
//	    WebElement srcbox = driver.findElement(By.id("APjFqb"));
//	    srcbox.sendKeys("Java Tutorial");
//	    srcbox.sendKeys(Keys.ENTER);
//	    Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
//	    softassert.assertAll();
////	    test for commit,,,,,
//  }
  
  
  
	
  @AfterMethod
 	public void teardown () throws InterruptedException {
	  
	  driver.close();
}}
