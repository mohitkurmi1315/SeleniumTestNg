package testScripts;

import org.testng.annotations.Test;

public class Sample2 {
  @Test (groups = "featureOne")
  public void onetestone() {
	  System.out.println(" one Test one");
  }
  @Test(groups = "featureTwo")
  public void twotesttwo() {
	  System.out.println("two Ttesttwo");
  }
  @Test(groups = "featureThree")
  public void threetestthree() {
	  System.out.println(" three Test three");
  }
  @Test
  public void fourtestfour() {
	  System.out.println(" four Test four");
  }
  
}
