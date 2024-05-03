package testScripts;

import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import pages.ProductListPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class PlaceOrderTest {
	WebDriver driver;
	LoginPage loginPage;
	ProductListPage listPage;
	
	public PlaceOrderTest() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new LoginPage(driver);
		listPage = new ProductListPage(driver);
	}
	
	@BeforeMethod
	  public void setup() {
		TestBase.openUrl();
	  }
	
  @Test (priority = 1)
  public void validLogin() {
	  loginPage.login("standard_user", "secret_sauce");
	  boolean isValid = listPage.isOnProducts();
	  Assert.assertTrue(isValid);
  }
  
  @Test (priority = 2)
  public void addItem() {
	  
	  listPage.addToCart();
	  listPage.viewCart();
	  
  }
  
  

  

}
