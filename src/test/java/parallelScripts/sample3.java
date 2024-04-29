package parallelScripts;

import org.testng.annotations.Test;

public class sample3 {
  @Test
  public void testOne() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test31 in sample3...." + id);
  }
  @Test
public void testTwo() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test32 in sample3...." + id);
  }
  @Test
public void testThree() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test33 in sample3...." + id);
}
  @Test(invocationCount= 6, threadPoolSize= 3, timeOut = 2000)
public void testFour() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test34 in sample3...." + id);
}
}
