package parallelScripts;

import org.testng.annotations.Test;

public class sample1 {
  @Test
  public void testOne() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test11 in sample1...." + id);
  }
public void testTwo() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test12 in sample1...." + id);
  }
public void testThree() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test13 in sample1...." + id);
}
public void testFour() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test14 in sample1...." + id);
}
}
