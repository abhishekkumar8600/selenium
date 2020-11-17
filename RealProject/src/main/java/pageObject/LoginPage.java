package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;
	
	
	By email=By.xpath("//input[@id='user_email']");
	By pwd=By.xpath("//input[@id='user_password']");
	By login=By.cssSelector("input.btn.btn-primary.btn-md.login-button");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPwd()
	{
		return driver.findElement(pwd);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
}
