import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\selenium jars\\cd\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//switching control to frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.cssSelector("div#draggable"));
		WebElement target=driver.findElement(By.cssSelector(" div#droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		driver.quit();
	}

}
