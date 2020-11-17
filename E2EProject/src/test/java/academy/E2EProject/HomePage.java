package academy.E2EProject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;



public class HomePage extends Base {

	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver= initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
	}
	
	
      @Test(dataProvider="getData")
      public void basePageNavigation(String email,String pwd) throws IOException
      {
	  
	  
	 //one is inheritance
     //creating object to class and invoking method of it
	      
	   LandingPage l=new LandingPage(driver);
	   l.getLogin().click();
	   
	   LoginPage lp=new LoginPage(driver);
	   lp.getEmaild().sendKeys(email);
	   lp.getPassword().sendKeys(pwd);
	   lp.getLogin().click();
	   
      }
      @DataProvider()
      public Object[][] getData()
      {
    	Object[][] data=new Object[3][2];  
    	data[0][0]="aaakkk";
    	data[0][1]="112233";
    	
    	data[1][0]="bbb";
    	data[1][1]="112233";
    	
    	data[2][0]="ccccc";
    	data[2][1]="112233";
    	
    	return data;
      }
      @AfterTest
      public void shut()
      {
    	  driver.close();
      }
    	  
      
      
      
      
      
      
         
      
      


}