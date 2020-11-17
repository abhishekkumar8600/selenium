package academy.RealProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class ValidateTitle extends Base {
	 
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializedriver();
		driver.get("http://www.qaclickacademy.com/");
	}
	
	@Test
	public void basepageNavigation() 
	{
		
		
		LandingPage l=new LandingPage(driver);
		Assert.assertEquals(l.getTitle(), "FEATURED COURSESSS");
		
		
		
		
	}
	

	@AfterTest
	public void teminate()
	{
		driver.close();
	}

}
