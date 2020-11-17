package demo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	  @Test()
	  public void testDemo1()
	  {
		 System.out.println("sks"); 
	  }
	  
	  @BeforeTest()
	  public void testDemo4()
	  {
		 System.out.println("beforetest"); 
	  }
	  
	  

	}


