package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {
         
	public WebDriver driver;
	
	By sign=By.xpath("//span[contains(text(),'Login')]");
	By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By navigationbar=By.xpath("//a[text()='Courses']");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		
		return driver.findElement(sign);
		
	}
	
	public WebElement getTitle()
	{
		
		return driver.findElement(title);
		
	}
	
	public WebElement getNavigationBar()
	{
		
		return driver.findElement(navigationbar);
		
	}
	
	
	
}
