package demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
	@BeforeMethod()
	public void testDemo2()
	{
		System.out.println("bm3");
	}
	
	@BeforeClass()
	public void testDemo3()
	{
		System.out.println("bc3");
	}
	
	@Test()
	public void testDemo22()
	{
		System.out.println("erree");
	}


}
