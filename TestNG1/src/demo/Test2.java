package demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test2 {
	@Test()
	public void testDemo2()
	{
		System.out.println("skskjdkd");
	}
	
	@AfterTest()
	public void testDemo3()
	{
		System.out.println("aftertest");
	}

}
