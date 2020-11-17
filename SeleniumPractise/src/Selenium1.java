import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\selenium jars\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.netflix.com/in/");
		
		driver.findElement(By.cssSelector("input#id_email_hero_fuji")).sendKeys("ankitvars73@gmail.com");
		
		driver.findElement(By.xpath("//body/div[@id='appMountPoint']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/button[1]")).click();
		
	
	}

}
