import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\selenium jars\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		Select s=new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
		
		s.selectByVisibleText("Option3");
		

	}

}