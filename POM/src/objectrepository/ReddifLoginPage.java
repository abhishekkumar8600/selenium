package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifLoginPage {
    
	WebDriver driver;
	
	
	public ReddifLoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	By username=By.xpath("//input[@id='login1']");
	By password=By.cssSelector("#password");
	By sign=By.xpath("//input[@class='signinbtn']");
	
	public WebElement EmalId()
	{
	return driver.findElement(username);	
	}
	
	
	public  WebElement PassWord()
	{
		return driver.findElement(password);
	}
	
	public WebElement SubMit()
	{
		return driver.findElement(sign);
	}
	

	

}
