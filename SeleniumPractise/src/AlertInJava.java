import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\selenium jars\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input#name")).sendKeys("abhishek kumar");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
	}

}
