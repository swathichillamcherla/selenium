package demo;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test(priority =2)
  public void login() {
	  System.out.println("Testcase1; login to application");
	  
  }
  @Test(priority=4)
  public void search() {
	  System.out.println("Test case2:search the tickets");
  }
  @Test(priority=3)

	  public void book() {
		  System.out.println("Test case3:book search the tickets");
	  }
  @Test(priority=1)
		  public void logout() {
			  System.out.println("Test case4:logout the tickets");
		  }
			
		
  }
	  

