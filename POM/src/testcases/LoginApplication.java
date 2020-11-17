package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.ReddifLoginPage;

public class LoginApplication {
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium jars\\cd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		ReddifLoginPage r=new ReddifLoginPage(driver);
		r.EmalId().sendKeys("hello");
		r.PassWord().sendKeys("hello");
		r.SubMit().click();
		
	}

	
}
