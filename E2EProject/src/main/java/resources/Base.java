package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public 	WebDriver driver;
    
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\javaworkspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		
		prop.load(file);
		String browserName=prop.getProperty("browser");
	
		
		
		
		 if(browserName.equals("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\selenium jars\\cd\\chromedriver.exe");
		        
				driver=new ChromeDriver();
				
		 }
		 
		 else if(browserName=="firefox")
		 {
			 
		 }
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
	}

}
