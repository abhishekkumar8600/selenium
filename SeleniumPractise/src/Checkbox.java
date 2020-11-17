import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\selenium jars\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		/*System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		
		//to find count of checkboxes in the webpage
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
		   System.out.println(list.size());
	     */
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		
		//to find count of checkboxes in the webpage
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
		   Assert.assertEquals(list.size() , 6);
		
		
		


	}

}