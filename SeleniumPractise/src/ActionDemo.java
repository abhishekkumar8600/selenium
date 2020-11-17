import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\selenium jars\\cd\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		/*Actions a=new Actions(driver);
		
		WebElement mover=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		//composite action 
		a.moveToElement(mover).click().keyDown(Keys.SHIFT).sendKeys("shorts").build().perform();
		
		*/
		
		
		Actions a=new Actions(driver);
		
		WebElement element=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.moveToElement(element).click().keyDown( Keys.SHIFT).sendKeys("realme ").build().perform();		
		

	}

}
