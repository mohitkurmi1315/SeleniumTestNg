package parallelScripts;

import org.testng.annotations.Test;

public class sample2 {
  @Test
  public void testOne() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test31 in sample1...." + id);
  }
public void testTwo() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test32 in sample1...." + id);
  }
public void testThree() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test33 in sample1...." + id);
}
public void testFour() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test34 in sample1...." + id);
}
}
