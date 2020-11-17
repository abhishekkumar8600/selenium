import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\selenium jars\\cd\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.goibibo.com/");
		Thread.sleep(1000);
		WebElement w=driver.findElement(By.cssSelector("input#gosuggest_inputSrc"));
		
		w.clear();
		w.sendKeys("indira");
		Thread.sleep(1000);
		
		for(int i=0;i<=4;i++)
		{
			w.sendKeys(Keys.ARROW_DOWN);
		}
		w.sendKeys(Keys.ENTER);

	}

}
