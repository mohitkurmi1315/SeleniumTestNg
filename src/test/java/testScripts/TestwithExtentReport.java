package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import commonUtils.Utility;

public class TestwithExtentReport {
	WebDriver driver;
	ExtentReports extentReports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	
	@BeforeTest
	public void initExtent() {
		extentReports = new ExtentReports();
		spark = new ExtentSparkReporter("test-output/SparkReport.html")
				.viewConfigurer()
				.viewOrder()
				.as(new ViewName[] {
						ViewName.DASHBOARD,
						ViewName.TEST,
						ViewName.AUTHOR,
						ViewName.DEVICE,
						ViewName.LOG
				}).apply();
		extentReports.attachReporter(spark);
		
	}
	
	@BeforeMethod
	public void setup () {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
  @Test (retryAnalyzer = RetryAnalyserimpl.class)
  public void javaSearchTest() {
	    extentTest= extentReports.createTest("Selenium Search Test");
		driver.get("https://www.google.com");
	    WebElement srcbox = driver.findElement(By.id("APjFqb"));
	    srcbox.sendKeys("Java Tutorial");
	    srcbox.sendKeys(Keys.ENTER);
	    Assert.assertEquals(driver.getTitle(),"Java Tutorial - Googlee Search");
//	    test for commit,,,,,
  }
  
  @Test()
  public void seleniumSearchTest() {
	  extentTest= extentReports.createTest("Selenium Search Test");
		driver.get("https://www.google.com");
	    WebElement srcbox = driver.findElement(By.id("APjFqb"));
	    srcbox.sendKeys("Selenium tutorial");
	    srcbox.sendKeys(Keys.ENTER);
	    
      
}
  
  
  
  
  
	@AfterTest
	public void flushReport() {
		extentReports.flush();
	}
  @AfterMethod
 	public void teardown (ITestResult result) {
	  extentTest.assignAuthor("AutomationTester1")
	  .assignCategory("Regression")
	  .assignDevice(System.getProperty("os.name"))
	  .assignDevice(System.getProperty("os.version"));
	  if (ITestResult.FAILURE== result.getStatus()) {
		 
		  
		  extentTest.log(Status.FAIL, result.getThrowable().getMessage());
		  String strPath = Utility.getScreenshotPath(driver);
		  extentTest.fail(MediaEntityBuilder.createScreenCaptureFromPath(strPath).build());
	  }

	  
	 driver.close();
}
     
  }

