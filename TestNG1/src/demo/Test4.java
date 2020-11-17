package demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test4 {
	
	 
		@BeforeClass
		public void testDemo5()
		{
			System.out.println("beforeclass");
		}
		
		@BeforeMethod
		public void testDemo6()
		{
			System.out.println("beforemethod");
		}
		@Test()
		public void testDemo7()
		{
			System.out.println("jjjjjjjjj");
		}

}
