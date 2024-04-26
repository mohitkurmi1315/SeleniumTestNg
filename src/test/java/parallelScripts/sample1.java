package parallelScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sample1 {
  @Test
  public void testOne() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test11 in sample1...." + id);
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	    WebElement srcbox = driver.findElement(By.id("APjFqb"));
	    srcbox.sendKeys("Java Tutorial");
	    srcbox.sendKeys(Keys.ENTER);
  }
  @Test
public void testTwo() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test12 in sample1...." + id);
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/login");
    driver.findElement(By.id("username")).sendKeys("tomsmith");
    driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//    driver.findElement(By.className("radius")).click();
    driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
//    driver.findElement(By.linkText("Elemental Selenium")).click();
    driver.findElement(By.partialLinkText("Elemental")).click();
	  
  }
  @Test
public void testThree() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test13 in sample1...." + id);
}
  @Test
public void testFour() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test14 in sample1...." + id);
}
}
