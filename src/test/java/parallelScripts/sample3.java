package parallelScripts;

import org.testng.annotations.Test;

public class sample3 {
  @Test
  public void testOne() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test21 in sample3...." + id);
  }
  @Test
public void testTwo() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test22 in sample3...." + id);
  }
  @Test
public void testThree() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test23 in sample3...." + id);
}
  @Test
public void testFour() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test24 in sample3...." + id);
}
}
