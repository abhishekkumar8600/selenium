import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendersHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\selenium jars\\cd\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		List<WebElement> dates=driver.findElements(By.cssSelector("//td[@data-month='9']"));
		for(int i=0;i<dates.size();i++)
		{
		 String s=dates.get(i).getText();	
		 
		 if(s.equalsIgnoreCase("29"))
		 {
			 dates.get(i).click(); 
			 break;
		 }
		}

	}

}
