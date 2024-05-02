package testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v122.log.Log;
import org.openqa.selenium.devtools.v123.network.Network;
import org.testng.annotations.AfterMethod;

public class CDP {
	ChromeDriver driver;
	DevTools devTools;
	
	
	@BeforeMethod
	  public void setup() {
		  driver = new ChromeDriver();
		  devTools = driver.getDevTools();
		  devTools.createSession(driver.getWindowHandle());
	  }

  @Test
  public void deviceModeTest() {
	  Map devoceMetrics = new HashMap() {{
		  put("width", 500);
		  put("height", 1200);
		  put("deviceScaleFactor", 50);
		  put("mobile", true);
	  }};
	  driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", devoceMetrics);
	  driver.get("https://www.selenium.dev/");
	  }
  
  @Test
  public void getlocationTest() {
	  Map locationMetrics = new HashMap() {{
		  //Atlanta
		  //put("latitude", 33.748997);
		  //put("longitude", -84.387985);
		  //Indore
		  put("latitude", 22.725948);
		  put("longitude", 75.853840);
		  put("accuracy", 100);
		  
	  }};
	  driver.executeCdpCommand("Emulation.setGeolocationOverride", locationMetrics);
	  // Below URl will show only USA states
	  driver.get("https://oldnavy.gap.com/stores");
	  
	  }
  
  @Test
  public void CaptureConsolelogTest() {
	  devTools.send(Log.enable());
	  //devTools.addListener(Log.entryAdded());
		  
	  
	  
	  }
  
  @Test
  public void BasicAuthTest() {
	  
		  
	  
	  
	  }
  
  @AfterMethod
  public void tearDown() {
	 //driver.close();
  }

}
