package parallelScripts;

import org.testng.annotations.Test;

public class sample3 {
  @Test
  public void testOne() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test21 in sample1...." + id);
  }
public void testTwo() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test22 in sample1...." + id);
  }
public void testThree() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test23 in sample1...." + id);
}
public void testFour() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test24 in sample1...." + id);
}
}
