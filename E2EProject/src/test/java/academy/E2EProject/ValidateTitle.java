package academy.E2EProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class ValidateTitle extends Base{
      
	@BeforeTest
	public void initialize() throws IOException
	{
		driver= initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
	}
	
	 @Test
     public void basePageNavigation() throws IOException
     {
		 
		
	  
	 //one is inheritance
    //creating object to class and invoking method of it
	  
	   
	   LandingPage l=new LandingPage(driver);
	   Assert.assertEquals( l.getTitle().getText(), "FEATURED COURSES");
	  
	   
			   
	   
     } 
	 
	 @AfterTest
	 public void shut()
	 {
		 driver.close();
	 }
	 
	 
     
}
