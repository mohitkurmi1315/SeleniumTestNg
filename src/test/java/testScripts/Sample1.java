package testScripts;

import org.testng.annotations.Test;

public class Sample1 {
  @Test (groups = "featureOne")
  public void testone() {
	  System.out.println("Test one");
  }
  @Test(groups = "featureTwo")
  public void testtwo() {
	  System.out.println("Ttesttwo");
  }
  @Test (groups = "featureThree")
  public void testthree() {
	  System.out.println("Test three");
  }
  @Test
  public void testfour() {
	  System.out.println("Test four");
  }
  
}
