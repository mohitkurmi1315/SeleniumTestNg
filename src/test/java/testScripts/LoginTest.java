package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void login() {
	  
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
      driver.get("https://the-internet.herokuapp.com/login");
      driver.findElement(By.id("username")).sendKeys("tomsmith");
      driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//      driver.findElement(By.className("radius")).click();
      driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
//      driver.findElement(By.linkText("Elemental Selenium")).click();
      driver.findElement(By.partialLinkText("Elemental")).click();
  }
}
